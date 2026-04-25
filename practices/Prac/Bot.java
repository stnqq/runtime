package practices.Prac;

public class Bot {
    String name;
    String specialization;

    public Bot(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        System.out.println("Чат-бот " + name + " создан");
        System.out.println("Категория бота: " + specialization);
    }
}
