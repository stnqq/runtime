package twelve.Practice;

public interface MailClient {
    void send(String form, String to, String text);
    void receive();
}
