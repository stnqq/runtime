package tasktracker.tasktrackerv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTaskManager implements TaskManager {
    private final HistoryManager historyManager;
    private static int taskId = 1;

    public InMemoryTaskManager(HistoryManager historyManager) {
        this.historyManager = historyManager;
    }

    private final Map<Integer, Task> tasks = new HashMap<>();
    private final Map<Integer, Epic> epics = new HashMap<>();
    private final Map<Integer, Subtask> subtasks = new HashMap<>();

    public int generateId() {
        return taskId++;
    }

    @Override
    public void createTask(Task task) {
        task.setId(generateId());
        tasks.put(task.getId(), task);
    }

    @Override
    public void createTask(Epic epic) {
        epic.setId(generateId());
        epics.put(epic.getId(), epic);
    }

    @Override
    public void createTask(Subtask subtask, int epicId) {

        if (!epics.containsKey(epicId)) {
            System.out.println("Эпик с таким айди не найден, невозможно создать подзадачу для него: " + epicId);
            return;
        }
        int newId = generateId();
        subtask.setId(newId);
        subtask.setEpicId(epicId);
        subtasks.put(newId, subtask);

        Epic epic = epics.get(epicId);
        epic.getSubtaskIds().add(newId);

        updateEpicStatus(epicId);
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    @Override
    public List<Task> getAllEpics() {
        return new ArrayList<>(epics.values());
    }

    @Override
    public List<Task> getAllSubtasks() {
        return new ArrayList<>(subtasks.values());
    }

    @Override
    public void deleteAllTasks() {
        if (!tasks.isEmpty()) {
            tasks.clear();
            System.out.println("Вы очистили все задачи!");
        }
    }

    @Override
    public void deleteAllEpics() {
        subtasks.clear();
        epics.clear();
    }

    @Override
    public void deleteAllSubtasks() {
        subtasks.clear();
    }

    @Override
    public Task getById(int id) {
        Task task = tasks.get(id);
        if (task == null) {
            task = epics.get(id);
        }
        if (task == null) {
            task = subtasks.get(id);
        }
        if (task != null) {
            historyManager.addToHistory(task);
            return task;
        }
        System.out.println("Ничего не найдено для ID: " + id);
        return null;
    }

    @Override
    public void updateTask(Task task, int oldTaskId, Status status) {
        if (tasks.containsKey(oldTaskId)) {
            Task savedTask = tasks.get(oldTaskId);
            savedTask.setName(task.getName());
            savedTask.setDescription(task.getDescription());
            savedTask.setStatus(status); // Используем статус из аргумента
            System.out.println("Задача успешно обновлена");
        } else {
            System.out.println("Ошибка: Задача с ID " + oldTaskId + " не найдена");
        }
    }

    @Override
    public void updateEpic(Epic epic, int oldEpicId) {
        if (epics.containsKey(oldEpicId)) {
            Epic savedEpic = epics.get(oldEpicId);
            savedEpic.setName(epic.getName());
            savedEpic.setDescription(epic.getDescription());
            updateEpicStatus(oldEpicId);
            System.out.println("Эпик успешно обновлен");
        } else {
            System.out.println("Ошибка: Эпик с ID " + oldEpicId + " не найден");
        }
    }

    @Override
    public void updateTask(Subtask subtask, int subtaskOldId, Status status) {
        if (subtasks.containsKey(subtaskOldId)) {
            Subtask saved = subtasks.get(subtaskOldId);
            saved.setName(subtask.getName());
            saved.setDescription(subtask.getDescription());
            saved.setStatus(status);

            updateEpicStatus(saved.getEpicId());
        } else {
            System.out.println("Ошибка: Подзадача с ID " + subtaskOldId + " не найдена");
        }
    }

    @Override
    public void deleteById(int id) {
        if (tasks.containsKey(id)) {
            tasks.remove(id);
        } else if (epics.containsKey(id)) {
            List<Integer> idsToRemove = new ArrayList<>();
            for (Subtask subtask : subtasks.values()) {
                if (subtask.getEpicId() == id) {
                    idsToRemove.add(subtask.getId());
                }
            }
            for (Integer subtaskId : idsToRemove) {
                subtasks.remove(subtaskId);
            }
            epics.remove(id);
        } else if (subtasks.containsKey(id)) {
            int epicId = subtasks.get(id).getEpicId();
            subtasks.remove(id);
            updateEpicStatus(epicId);
        } else {
            System.out.println("Task с id " + id + " не найден");
        }
    }

    @Override
    public Map<Integer, Subtask> getSubtasksOfEpic(int epicId) {
        Map<Integer, Subtask> subtasksOfEpic = new HashMap<>();
        for (Subtask subtask : subtasks.values()) {
            if (subtask.getEpicId() == epicId) {
                subtasksOfEpic.put(subtask.getId(), subtask);
            }
        }
        return subtasksOfEpic;
    }

    @Override
    public List<Task> getHistory() {
        return historyManager.getHistory();
    }

    private void updateEpicStatus(int epicId) {
        Epic epic = epics.get(epicId);
        if (epic == null) return;

        List<Integer> subIds = epic.getSubtaskIds();
        if (subIds.isEmpty()) {
            epic.setStatus(Status.NEW);
            return;
        }

        int countNew = 0;
        int countDone = 0;

        for (int id : subIds) {
            Status status = subtasks.get(id).getStatus();
            if (status == Status.NEW) countNew++;
            if (status == Status.DONE) countDone++;
        }

        if (countDone == subIds.size()) {
            epic.setStatus(Status.DONE);
        } else if (countNew == subIds.size()) {
            epic.setStatus(Status.NEW);
        } else {
            epic.setStatus(Status.IN_PROGRESS);
        }
    }
}