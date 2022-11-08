package flowerstore.delivery;

import flowerstore.item.Item;

import java.util.List;

public class DHLDeliveyStrategy implements Delivery{
    @Override
    public String deliver(List<Item> items) {
        return items.toString() + " will be delivered by DHL service.";
    }
}
