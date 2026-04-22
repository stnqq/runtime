package tasktracker.tasktrackerv1;

public class Subtask extends Task {
    private int epicId;

    public Subtask(String name, String description) {
        super(name, description);
    }

    @Override
    public String toString() {
        return "Task{" +
                " id='" + getId() + "'" + '\'' +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", status=" + getStatus() + " " +
                ", epicId=" + getEpicId() + " " +
                '}';
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }

    public int getEpicId() {
        return epicId;
    }
}