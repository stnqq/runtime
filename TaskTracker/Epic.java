package TaskTracker;

import java.util.List;

public class Epic extends Task {

    public List<Integer> getSubtaskIds() {
        return subtaskIds;
    }

    public void setSubtaskIds(List<Integer> subtaskIds) {
        this.subtaskIds = subtaskIds;
    }

    private List<Integer> subtaskIds;

    public Epic(String name, String description, Status status, List<Integer> subtaskIds) {
        super(name, description, status);
        this.subtaskIds = subtaskIds;
    }

    @Override
    public String toString() {
        return "Epic [ID=" + getID() +
                ", name=" + getName() +
                ", description=" + getDescription() +
                ", status=" + getStatus() +
                ", subtaskIds=" + subtaskIds + "]";
    }
}
