package tasktracker.tasktrackerv1;

import java.util.ArrayList;

public class Epic extends Task {
    ArrayList<Integer> subtaskIds;

    public Epic(String name, String description) {
        super(name, description);
        subtaskIds = new ArrayList<>();
    }

    public ArrayList<Integer> getSubtaskIds() {
        return subtaskIds;
    }
}
