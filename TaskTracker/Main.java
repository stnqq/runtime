package TaskTracker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = Managers.getDefault();

        // 1. Создание задач
        Task task1 = new Task("Купить продукты", "Купить молоко и хлеб", Status.NEW);
        Task task2 = new Task("Позвонить", "Позвонить заказчику", Status.NEW);

        manager.createTask(task1);
        manager.createTask(task2);

        // 2. Создание эпиков
        Epic epic1 = new Epic("Переезд", "Организовать переезд", Status.NEW, new ArrayList<>());
        Epic epic2 = new Epic("Ремонт", "Сделать ремонт в комнате", Status.NEW, new ArrayList<>());

        manager.createEpic(epic1);
        manager.createEpic(epic2);

        // 3. Создание подзадач
        Subtask subtask1 = new Subtask("Собрать коробки", "Упаковать вещи", Status.NEW, epic1.getID());
        Subtask subtask2 = new Subtask("Заказать машину", "Найти транспорт", Status.NEW, epic1.getID());
        Subtask subtask3 = new Subtask("Купить краску", "Выбрать цвет стен", Status.NEW, epic2.getID());

        manager.createSubtask(subtask1);
        manager.createSubtask(subtask2);
        manager.createSubtask(subtask3);

        // 4. Вывод всех сущностей
        System.out.println("===== ВСЕ ЗАДАЧИ =====");
        manager.printAllTasks();

        System.out.println();
        System.out.println("===== ВСЕ ЭПИКИ =====");
        manager.printAllEpics();

        System.out.println();
        System.out.println("===== ВСЕ ПОДЗАДАЧИ =====");
        manager.printAllSubtasks();

        // 5. Получение по id
        System.out.println();
        System.out.println("===== ПОЛУЧЕНИЕ ПО ID =====");
        System.out.println("Задача: " + manager.getTaskById(task1.getID()));
        System.out.println("Эпик: " + manager.getEpicById(epic1.getID()));
        System.out.println("Подзадача: " + manager.getSubtaskById(subtask1.getID()));

        // 6. История просмотров
        System.out.println();
        System.out.println("===== ИСТОРИЯ ПРОСМОТРОВ =====");
        System.out.println(manager.getHistory());

        // 7. Изменение статусов подзадач и проверка статуса эпика
        subtask1.setStatus(Status.DONE);
        manager.updateSubtask(subtask1);

        System.out.println();
        System.out.println("===== ПОСЛЕ ЗАВЕРШЕНИЯ ПЕРВОЙ ПОДЗАДАЧИ =====");
        manager.printAllEpics();

        subtask2.setStatus(Status.DONE);
        manager.updateSubtask(subtask2);

        System.out.println();
        System.out.println("===== ПОСЛЕ ЗАВЕРШЕНИЯ ВСЕХ ПОДЗАДАЧ ПЕРВОГО ЭПИКА =====");
        manager.printAllEpics();

        // 8. Получение подзадач конкретного эпика
        System.out.println();
        System.out.println("===== ПОДЗАДАЧИ ПЕРВОГО ЭПИКА =====");
        manager.printSubtasksOfEpic(epic1.getID());

        // 9. Удаление одной задачи и одного эпика
        manager.deleteTaskById(task2.getID());
        manager.deleteEpicById(epic2.getID());

        System.out.println();
        System.out.println("===== ПОСЛЕ УДАЛЕНИЯ =====");
        System.out.println("Задачи:");
        manager.printAllTasks();

        System.out.println();
        System.out.println("Эпики:");
        manager.printAllEpics();

        System.out.println();
        System.out.println("Подзадачи:");
        manager.printAllSubtasks();
    }
}