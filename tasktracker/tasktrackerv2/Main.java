package tasktracker.tasktrackerv2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = Managers.getDefault();

        Task task = new Task("Сдать проект", "Финальная проверка кода");
        manager.createTask(task);

        Epic epic = new Epic("Путешествие", "Поездка в горы");
        manager.createTask(epic);

        Subtask sub1 = new Subtask("Купить билеты", "На поезд или самолет");
        manager.createTask(sub1, epic.getId());
        Subtask sub2 = new Subtask("Забронировать отель", "Желательно с видом");
        manager.createTask(sub2, epic.getId());

        System.out.println("Статус эпика в начале: " + epic.getStatus());

        manager.updateTask(sub1, sub1.getId(), Status.IN_PROGRESS);
        System.out.println("Статус эпика после первой подзадачи: " + manager.getById(epic.getId()).getStatus());

        manager.updateTask(sub1, sub1.getId(), Status.DONE);
        manager.updateTask(sub2, sub2.getId(), Status.DONE);
        System.out.println("Статус эпика после всех подзадач: " + manager.getById(epic.getId()).getStatus());

        manager.getById(task.getId());
        manager.getById(epic.getId());
        manager.getById(sub1.getId());
        manager.getById(task.getId());

        System.out.println("\n--- История просмотров ---");
        List<Task> history = manager.getHistory();
        for (Task t : history) {
            System.out.println("ID: " + t.getId() + " | " + t.getName() + " (" + t.getClass().getSimpleName() + ")");
        }

        System.out.println("\nУдаляем задачу ID: " + task.getId());
        manager.deleteById(task.getId());

        System.out.println("Удаляем эпик ID: " + epic.getId() + " (вместе с ним должны удалиться подзадачи)");
        manager.deleteById(epic.getId());

        System.out.println("\nИтоговая проверка списков:");
        System.out.println("Задачи: " + manager.getAllTasks().size());
        System.out.println("Эпики: " + manager.getAllEpics().size());
        System.out.println("Подзадачи: " + manager.getAllSubtasks().size());
    }
}