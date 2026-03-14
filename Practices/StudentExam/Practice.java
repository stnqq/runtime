package Practices.StudentExam;

public class Practice {
    public static void main(String[] args) {
        Student student = new Student("Aibar", 2);
        Exam exam1 = new Exam(student, 60);
        exam1.printResult(student, exam1);
    }
}
