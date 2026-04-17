package TaskTracker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class InMemoryTaskManager implements TaskManager {
    private final HashMap<Integer, Task> tasks = new HashMap<>();
    private final HashMap<Integer, Epic> epics = new HashMap<>();
    private final HashMap<Integer, Subtask> subtasks = new HashMap<>();

    private int nextId = 1;
    private List<Task> history = new ArrayList<>();

    public int generateTaskId() {
        return nextId++;

    }

    public void createTask(Task task) {
        task.setID(generateTaskId());
        tasks.put(task.getID(), task);
    }

    public void printAllTasks() {
        for (Task task : tasks.values()) {
            System.out.println(task);
        }
    }

    public Task getTaskById(int id) {
        Task task = tasks.get(id);
        addToHistory(task);
        return task;
    }

    public Collection<Task> getAllTasks() {
        return tasks.values();
    }

    public void deleteTaskById(int id) {
        tasks.remove(id);
    }

    public void deleteAllTasks() {
        tasks.clear();
    }

    public void updateTask(Task task) {
        if (tasks.containsKey(task.getID())) {
            tasks.put(task.getID(), task);
        }
    }

    public void createEpic(Epic epic) {
        epic.setID(generateTaskId());
        epics.put(epic.getID(), epic);
    }

    @Override
    public Epic getEpicById(int id) {
        Epic epic = epics.get(id);
        addToHistory(epic);
        return epic;
    }

    public void printSubtasksOfEpic(int epicId) {
        Epic epic = epics.get(epicId);

        if (epic != null) {
            for (Integer subtaskId : epic.getSubtaskIds()) {
                System.out.println(subtasks.get(subtaskId));
            }
        }
    }

    public void printAllEpics() {
        for (Epic epic : epics.values()) {
            System.out.println(epic);
        }
    }

    public void updateEpic(Epic epic) {
        if (epics.containsKey(epic.getID())) {
            epics.put(epic.getID(), epic);
        }
    }

    public void updateEpicStatus(Epic epic) {
        if (epic.getSubtaskIds().isEmpty()) {
            epic.setStatus(Status.NEW);
            return;
        }

        int newCount = 0;
        int doneCount = 0;

        for (Integer subtaskId : epic.getSubtaskIds()) {
            Subtask subtask = subtasks.get(subtaskId);

            if (subtask.getStatus() == Status.NEW) {
                newCount++;
            } else if (subtask.getStatus() == Status.DONE) {
                doneCount++;
            }
        }

        if (newCount == epic.getSubtaskIds().size()) {
            epic.setStatus(Status.NEW);
        } else if (doneCount == epic.getSubtaskIds().size()) {
            epic.setStatus(Status.DONE);
        } else {
            epic.setStatus(Status.IN_PROGRESS);
        }
    }

    public void deleteEpicById(int id) {
        Epic epic = epics.get(id);

        if (epic != null) {
            for (Integer subtaskId : epic.getSubtaskIds()) {
                subtasks.remove(subtaskId);
            }
            epics.remove(id);
        }
    }

    public void deleteAllEpics() {
        epics.clear();
        subtasks.clear();
    }

    public void createSubtask(Subtask subtask) {
        if (epics.containsKey(subtask.getEpicId())) {
            subtask.setID(generateTaskId());
            subtasks.put(subtask.getID(), subtask);

            Epic epic = epics.get(subtask.getEpicId());
            epic.getSubtaskIds().add(subtask.getID());

            updateEpicStatus(epic);
        }
    }

    public void updateSubtask(Subtask subtask) {
        if (subtasks.containsKey(subtask.getID())) {
            subtasks.put(subtask.getID(), subtask);

            Epic epic = epics.get(subtask.getEpicId());
            updateEpicStatus(epic);
        }
    }

    @Override
    public Subtask getSubtaskById(int id) {
        Subtask subtask = subtasks.get(id);
        addToHistory(subtask);
        return subtask;
    }

    public void printAllSubtasks() {
        for (Subtask subtasks : subtasks.values()) {
            System.out.println(subtasks);
        }
    }

    public void deleteSubtaskById(int id) {
        Subtask subtask = subtasks.get(id);

        if (subtask != null) {
            Epic epic = epics.get(subtask.getEpicId());

            if (epic != null) {
                epic.getSubtaskIds().remove(Integer.valueOf(id));
            }

            subtasks.remove(id);

            if (epic != null) {
                updateEpicStatus(epic);
            }
        }
    }

    public void deleteAllSubtasks() {
        for (Epic epic : epics.values()) {
            epic.getSubtaskIds().clear();
            updateEpicStatus(epic);
        }

        subtasks.clear();
    }

    private void addToHistory(Task task) {
        if (task != null) {
            history.add(task);

            if (history.size() > 10) {
                history.remove(0);
            }
        }
    }

    public List<Task> getHistory() {
        return new ArrayList<>(history);
    }
}
