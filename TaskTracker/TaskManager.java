package TaskTracker;

import java.util.Collection;
import java.util.List;

public interface TaskManager {
    void createTask(Task task);

    Task getTaskById(int id);

    Collection<Task> getAllTasks();

    void deleteTaskById(int id);

    void deleteAllTasks();

    void updateTask(Task task);

    void createEpic(Epic epic);

    Epic getEpicById(int id);

    void updateEpic(Epic epic);

    void deleteEpicById(int id);

    void deleteAllEpics();

    void createSubtask(Subtask subtask);

    Subtask getSubtaskById(int id);

    void updateSubtask(Subtask subtask);

    void deleteSubtaskById(int id);

    void deleteAllSubtasks();

    void printAllTasks();

    void printAllEpics();

    void printAllSubtasks();

    void printSubtasksOfEpic(int epicId);

    List<Task> getHistory();
}