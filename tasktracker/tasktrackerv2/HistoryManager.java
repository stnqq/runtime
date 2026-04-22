package tasktracker.tasktrackerv2;

import java.util.List;

public interface HistoryManager {

    void addToHistory(Task task);
    List<Task> getHistory();

}
