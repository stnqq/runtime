package TaskTracker;

import java.util.List;

public class Epic extends Task {

private List<Integer> subtaskIds;
    public Epic(String name, String description, int ID, Status status, List<Integer> subtaskIds) {
        super(name, description, ID, status, subtaskIds);
    }

}
