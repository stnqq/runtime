package twelve.Practice;

public class Practice {
    public static void main(String[] args) {
//        Frog frog = new Frog();
//        System.out.println("Привет! Я - зеленая лягушка");
//        frog.move();
//
//        Toad toad = new Toad();
//        System.out.println("Привет! Я коричневая жаба");
//        toad.move();
//
//        String name = "Катя";
//
//        System.out.println("Что " + name + " делает как работник: ");
//        Employee employee = new SoftwareDeveloper(name);
//        employee.work();
//        System.out.println("Получает зарплату за месяц: " + employee.getSalary() + " тг.");
//
//        System.out.println("\nЧто " + name + " делает как человек: ");
//        Person person = new SoftwareDeveloper(name);
//        person.eat();
//        person.sleep();
//
//        System.out.println("\nЧто " + name + " делает как программист: ");
//        SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper(name);
//        softwareDeveloper.doDebug();
//        softwareDeveloper.think();
//
//        Actor actor = new Hamlet();
//        actor.play();
        // Координаты точки
        int x = 4;
        int y = 2;
        // Цвет точки
        String color = "розовый";

        Point point = new ColorPoint(x, y, color);

        System.out.println("Заданная точка была окрашена: " + point.getName());
    }
}
