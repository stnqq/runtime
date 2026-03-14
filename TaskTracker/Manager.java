package TaskTracker;

import java.util.HashMap;
import java.util.Map;

/*

Получение списка всех задач.
Удаление всех задач.
Получение по идентификатору.
Создание. Сам объект должен передаваться в качестве параметра.
Обновление. Новая версия объекта с верным идентификатором передаётся в виде параметра.
Удаление по идентификатору.


Получение списка всех подзадач определённого эпика. Управление статусами осуществляется по следующему правилу:

Менеджер сам не выбирает статус для задачи. Информация о нём приходит менеджеру вместе с информацией о самой задаче. По этим данным в одних случаях он будет сохранять статус, в других будет рассчитывать.

Для эпиков:

если у эпика нет подзадач или все они имеют статус NEW, то статус должен быть NEW.
если все подзадачи имеют статус DONE, то и эпик считается завершённым — со статусом DONE.
во всех остальных случаях статус должен быть IN_PROGRESS.

 */
public class Manager {
    private HashMap<Integer, Task> tasks = new HashMap<>();
    private HashMap<Integer, Epic> epics = new HashMap<>();
    private HashMap<Integer, Subtask> subtasks = new HashMap<>();

    private int nextId;


    public static void main(String[] args) {
        Task task = new Task("Первая задача", "Realization of Task Tracker", 1, Status.NEW);
        Manager manager = new Manager();
        // Как сделать идентификатор задачи, чтобы айди увеличивался сам, по мере создания задач?
        Task task1 = new Task("Вторая задача", "Realization of Task Manager", 2, Status.NEW);
        Map<Integer, Task> tasks = new HashMap<>();
        tasks.put(1, task);
        tasks.put(2, task1);
        manager.printAllTasks(tasks);
    }

    public void printAllTasks(Map<Integer, Task> hashMap) {
        for (Task task : hashMap.values()) {
            System.out.println(task);
        }
    }

    public int taskCountIncrease() {
        return nextId++;
    }
}
