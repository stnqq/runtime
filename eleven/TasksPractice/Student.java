package eleven.TasksPractice;

public class Student {
    String name;
    int age;
    static int studentCounter = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Создан студент: " + this.name);
        studentCounterIncrease();

    }

    public void studentCounterIncrease() {
        studentCounter++;
    }

    public static int studentTotalCount() {
        return studentCounter;
    }

}
