package tasktracker.tasktrackerv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectManager {
    private static int taskId = 1;

    Map<Integer, Task> tasks = new HashMap<>();
    Map<Integer, Epic> epics = new HashMap<>();
    Map<Integer, Subtask> subtasks = new HashMap<>();

    public int generateId() {
        return taskId++;
    }

    public void createTask(Task task) {
        task.setId(generateId());
        tasks.put(task.getId(), task);
    }

    public void createTask(Epic epic) {
        epic.setId(generateId());
        epics.put(epic.getId(), epic);
    }

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

    public void getAllTasks() {
        if (!tasks.isEmpty()) {
            System.out.println("Список всех задач:");
            for (Task task : tasks.values()) {
                System.out.println(task);
            }
        } else {
            System.out.println("Новых задач нет!");
        }
        System.out.println();
    }

    public void getAllEpics() {
        if (!epics.isEmpty()) {
            System.out.println("Список всех эпиков:");
            for (Epic epic : epics.values()) {
                System.out.println(epic);
            }
        } else {
            System.out.println("Новых эпиков нет!");
        }
        System.out.println();
    }

    public void getAllSubtasks() {
        if (!subtasks.isEmpty()) {
            System.out.println("Список всех подзадач:");
            for (Subtask subtask : subtasks.values()) {
                System.out.println(subtask);
            }
        } else {
            System.out.println("Новых подзадач нет!");
        }
        System.out.println();
    }

    public void deleteAllTasks() {
        if (!tasks.isEmpty()) {
            tasks.clear();
            System.out.println("Вы очистили все задачи!");
        }
    }

    public void deleteAllEpics() {
        epics.clear();
    }

    public void deleteAllSubtasks() {
        subtasks.clear();
    }

    public void getById(int id, Task task) {
        if (!tasks.isEmpty()) {
            if (task.getId() == id) {
                System.out.println(task);
            } else {
                System.out.println("Такой задачи не найдено!");
            }
        } else {
            System.out.println("Список задач пуст!");
        }
    }

    public void getById(int id, Epic epic) {
        if (!epics.isEmpty()) {
            if (epic.getId() == id) {
                System.out.println(epic);
            } else {
                System.out.println("Такой задачи не найдено!");
            }
        } else {
            System.out.println("Список задач пуст!");
        }
    }

    public void getById(int id, Subtask subtask) {
        if (!subtasks.isEmpty()) {
            if (subtask.getId() == id) {
                System.out.println(subtask);
            } else {
                System.out.println("Такой задачи не найдено!");
            }
        } else {
            System.out.println("Список задач пуст!");
        }
    }

    public void updateTask(Task taskNew, int oldId, Status status) {
        if (tasks.containsKey(oldId)) {
            Task savedTask = tasks.get(oldId);

            savedTask.setName(taskNew.getName());
            savedTask.setDescription(taskNew.getDescription());
            savedTask.setStatus(status);

            System.out.println("Задача успешно обновлен");
        } else {
            System.out.println("Ошибка: Задача с ID " + oldId + " не найдена");
        }
    }

    public void updateTask(Epic epicNew, int oldId) {
        if (epics.containsKey(oldId)) {
            Epic savedEpic = epics.get(oldId);

            savedEpic.setName(epicNew.getName());
            savedEpic.setDescription(epicNew.getDescription());

            updateEpicStatus(oldId);

            System.out.println("Эпик успешно обновлен");
        } else {
            System.out.println("Ошибка: Эпик с ID " + oldId + " не найден");
        }
    }

    public void updateTask(Subtask subtask, int id, Status status) {
        if (!subtasks.containsKey(id)) {
            System.out.println("Подзадача с таким ID не найдена");
            return;
        }

        Subtask saved = subtasks.get(id);
        saved.setName(subtask.getName());
        saved.setDescription(subtask.getDescription());
        saved.setStatus(status);

        updateEpicStatus(saved.getEpicId());

    }

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

    public Map<Integer, Subtask> getSubtasksOfEpic(int epicId) {
        Map<Integer, Subtask> subtasksOfEpic = new HashMap<>();
        for (Subtask subtask : subtasks.values()) {
            if (subtask.getEpicId() == epicId) {
                subtasksOfEpic.put(subtask.getId(), subtask);
            }
        }
        return subtasksOfEpic;
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