package flowerstore.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreditCardPaymentStrategyTest {
    Payment payment = new CreditCardPaymentStrategy();
    @Test
    void pay() {
        assertEquals(payment.pay(15), "You're going to pay 15.0 using your credit card.");
    }
}