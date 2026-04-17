package TaskTracker;

public class Task {
    private String name;
    private String description;
    private int ID;
    private Status status;


    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public  int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public  Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Task(String name, String description, Status status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task [ID=" + ID + ", name=" + name + ", description=" + description + ", status=" + status + "]";
    }

}
