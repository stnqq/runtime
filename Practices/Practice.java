package Practices;

public class Practice {
    public static void main(String[] args) {
        Hamster[] hamsters = new Hamster[3];
        hamsters[0] = new Hamster("ЧиЧи", 5);
        hamsters[1] = new Hamster("ФиЧи", 6);
        hamsters[2] = new Hamster("СиЧи", 7);

        hamsters[0].eat();
        hamsters[1].eat();
final int number;    }

    static class Hamster {
        String name;
        int age;

        void eat() {
            System.out.println("Хомяк " + name + " что-то съел. ");
        }

        Hamster(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

}
