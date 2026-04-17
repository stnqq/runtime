package TaskTracker;

public class Subtask extends Task {
    public int getEpicId() {
        return epicId;
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }

    private int epicId;

    public Subtask(String n, String d, Status s, int epicId) {
        super(n, d, s);
        this.epicId = epicId;
    }

    @Override
    public String toString() {
        return "Subtask [ID=" + getID() +
                ", name=" + getName() +
                ", description=" + getDescription() +
                ", status=" + getStatus() +
                ", epicId=" + epicId + "]";
    }
}
