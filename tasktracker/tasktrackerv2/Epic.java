package tasktracker.tasktrackerv2;

import java.util.ArrayList;
import java.util.List;

public class Epic extends Task {
    private List<Integer> subtaskIds;

    public Epic(String name, String description) {
        super(name, description);
        subtaskIds = new ArrayList<>();
    }

    public List<Integer> getSubtaskIds() {
        return subtaskIds;
    }
}
