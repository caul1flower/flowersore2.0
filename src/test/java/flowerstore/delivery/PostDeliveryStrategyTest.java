package flowerstore.delivery;

import flowerstore.flower.Rose;
import flowerstore.flower.Tulip;
import flowerstore.item.Item;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PostDeliveryStrategyTest {
    Delivery delivery = new PostDeliveryStrategy();
    @Test
    void deliver() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Rose());
        items.add(new Tulip());
        assertEquals(delivery.deliver(items), "[Rose, Tulip] will be delivered by post.");
    }
}