package practices.ClientOrder;

public class Order {
    int amount;

    public Order(Client client, int amount) {
        this.amount = amount;
        System.out.println("Заказ оформлен клиентом: " + client.name);
        System.out.println("Сумма: " + amount);
    }
    void printReceipt(Client client, Order order) {
        System.out.println("Имя клиента: " + client.name);
        System.out.println("Электронная почта клиента: " + client.email);
        System.out.println("Сумма заказа: " + order.amount);
    }
}
