package Eleven.Practice;

public class Bird {
    private static int count = 0;

    Bird(){
        count++;
        System.out.println("Количество созданных объектов: " + count);
    }
}
