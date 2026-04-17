package twelve.Practice;

public class Dove implements MailClient {
    @Override
    public void send (String from, String to, String text){
        System.out.println("Дрон отправился к " + to + " от " + from + " с электронным посланием: " + text);
    }

    @Override
    public void receive(){
        System.out.println("Дрон принес ответное сообщение!");
    }
}
