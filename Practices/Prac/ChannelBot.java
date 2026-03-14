package Practices.Prac;

public class ChannelBot extends Bot {
    String channel;

    // конструктор принимает объект суперкласса
    public ChannelBot(Bot bot, String channel) {
        super(bot.name, bot.specialization);
        this.channel = channel;
        System.out.println("Привет! Я - " + name + "!");
        System.out.println("Я специалист по теме " + specialization + "!");
        System.out.println("Рад приветствовать тебя на нашем канале «" + channel + "»");
    }
}


