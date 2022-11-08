package flowerstore.flower;

import flowerstore.delivery.Delivery;
import flowerstore.item.Item;
import flowerstore.payment.Payment;

import java.util.ArrayList;

public class Order {
    protected ArrayList<Item> items = new ArrayList<Item>();
    protected Payment payment;
    protected Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }
    public Order(ArrayList<Item> items, Payment payment, Delivery delivery) {
        this.items = items;
        this.payment = payment;
        this.delivery = delivery;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }
    public double calculateTotalPrice() {
        double total = 0.0;
        for (Item item: items) {
            total += item.getPrice();
        }
        return total;
    }
    public void processOrder() {
        double totalPrice = calculateTotalPrice();
        System.out.println("The price of your order is " + totalPrice);
        System.out.println(payment.pay(totalPrice));
        System.out.println(delivery.deliver(items));
    };
    public void addItem(Item item) {
        this.items.add(item);
    }
    public void removeItem(Item item) {
        this.items.remove(item);
    }
}
