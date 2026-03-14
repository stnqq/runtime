package Practices.Prac;

public class Practice {
    public static void main(String[] args) {
//        Bot bot = new Bot("C-3PO", "Этикет, обычаи и переводы");
//        Conversation conversation = new Conversation(bot, "Привет");

        Bot bot = new Bot("Тарантино", "кино");
        ChannelBot channelBot = new ChannelBot(bot,"Опять смотреть нечего!");
    }
}

