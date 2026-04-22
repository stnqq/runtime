package tasktracker.tasktrackerv1;

public class Main {
    public static void main(String[] args) {
        ObjectManager manager = new ObjectManager();

        Task task1 = new Task("Первая задача", "Описание к первой задаче");
        Task task2 = new Task("Вторая задача", "Описание к второй задаче");

        Epic epic1 = new Epic("Первый эпик", "Описание для первого эпика");
        Epic epic2 = new Epic("Второй эпик", "Описание для второго эпика");

        Subtask subtask1 = new Subtask("Первая подзадача", "Первое описание к первому эпику");
        Subtask subtask2 = new Subtask("Вторая подзадача", "Второе описание к первому эпику");
        Subtask subtask3 = new Subtask("Первая подзадача", "Третье описание, но для второго эпика");

        manager.createTask(task1);
        manager.createTask(task2);
        manager.createTask(epic1);
        manager.createTask(epic2);
        manager.createTask(subtask1, 3);
        manager.createTask(subtask2, 3);
        manager.createTask(subtask3, 4);

        manager.getAllTasks();
        manager.getAllEpics();
        manager.getAllSubtasks();

        Task taskForUpdate = new Task("Новая задача", "Описание к новой задаче");
        manager.updateTask(taskForUpdate, 2, Status.DONE);
        Epic epicForUpdate = new Epic("Новый эпик", "Описание к новому эпику");
        manager.updateTask(epicForUpdate, 3);
        Subtask subtaskForUpdate = new Subtask("Новая подзадача", "Описание к новой подзадаче");
        manager.updateTask(subtaskForUpdate, 6, Status.IN_PROGRESS);

        System.out.println("_--------------------------------------------_");
        System.out.println("Вывод всех задач после обновления");
        manager.getAllTasks();
        manager.getAllEpics();
        manager.getAllSubtasks();
    }
}
