package practices.GeoLesson;

public class GymTeacher extends Teacher {
    int basketballLessons; // уроки по баскетболу
    int swimmingLessons; // уроки по плаванию
    int freeLessons; // уроки без строгой программы

    // конструктор в подклассе принимает и свои параметры, и параметры суперкласса
    public GymTeacher(int newNumberOfLessons,
                      int newNumberOfPupils,
                      String newName,
                      int numberBasketballLessons,
                      int numberSwimmingLessons) {
        // сначала вызываем конструктор класса-родителя
        super(newNumberOfLessons, newNumberOfPupils, newName);
        // инициализируем новые поля
        basketballLessons = numberBasketballLessons;
        swimmingLessons = numberSwimmingLessons;
        // поле freeLessons вычисляется на основе заданных параметров
        freeLessons = newNumberOfLessons - numberBasketballLessons - numberSwimmingLessons;
    }

    public void printInfo() {
        System.out.println("ФИО учителя - " + name);
        System.out.println("Число учеников - " + numberOfPupils);
        System.out.println("Число уроков - " + numberOfLessons);
        System.out.println("Уроков по плаванию - " + swimmingLessons);
        System.out.println("Уроков по баскетболу - " + basketballLessons);
        System.out.println("Свободных уроков - " + freeLessons);
    }
}
