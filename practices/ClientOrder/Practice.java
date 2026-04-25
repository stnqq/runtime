package practices.ClientOrder;

public class Practice {
    public static void main(String[] args) {
        Client client = new Client("Aibar", "aibar@mail.ru");
        Order order = new Order(client, 6000);
        order.printReceipt(client, order);
    }
}
