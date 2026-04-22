package tasktracker.tasktrackerv2;

import java.util.List;
import java.util.Map;

public interface TaskManager {

    public void createTask(Task task);
    public void createTask(Epic epic);
    public void createTask(Subtask subtask, int epicId);

    public List<Task> getAllTasks();
    public List<Task> getAllEpics();
    public List<Task> getAllSubtasks();

    public void deleteAllTasks();
    public void deleteAllEpics();
    public void deleteAllSubtasks();

    public Task getById(int id);

    public void updateTask(Task task, int oldTaskId, Status status);
    public void updateEpic(Epic epic, int oldEpicId);
    public void updateTask(Subtask subtask, int subtaskOldId, Status status);

    public void deleteById(int id);

    public Map<Integer, Subtask> getSubtasksOfEpic(int epicId);

    public List<Task> getHistory();
    }
