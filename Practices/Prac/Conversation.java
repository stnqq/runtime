package Practices.Prac;

public class Conversation {
    String botName;
    String botSpecialization;
    String greeting;

    public Conversation(Bot bot, String greeting) { // конструктор принимает объект
        this.botName = bot.name; // значения нужно сохранить в полях объекта-параметра
        this.botSpecialization = bot.specialization;
        this.greeting = greeting;
        System.out.println(greeting + ", " + botName + "!");
        System.out.println(botSpecialization + " - отличная тема для разговора!");
    }
}