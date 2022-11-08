package flowerstore.payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "You're going to pay " + price + " using your credit card.";
    }
}
