package Practices.StudentExam;

public class Exam {
        int grade;
    public Exam(Student student, int grade){
        this.grade = grade;
        System.out.println("Оценка студента " + student.name + ": " + grade);
        if(this.grade < 60){
            System.out.println("Вы не сдали");
        } else {
            System.out.println("Экзамен успешно сдан");
        }
    }
    void printResult(Student student, Exam exam){
        System.out.println("Имя студента: " + student.name);
        System.out.println("Курс студента: " + student.course);
        System.out.println("Оценка студента: " + exam.grade);
    }
}
