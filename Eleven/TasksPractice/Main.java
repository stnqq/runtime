package Eleven.TasksPractice;

public class Main {
    public static void main(String[] args) {


        Student student = new Student("Alex", 18);
        Student student2 = new Student("Dias", 19);
        Student student3 = new Student("Ahat", 20);

        System.out.println("Всего студентов: " + Student.studentTotalCount());
    }
}
