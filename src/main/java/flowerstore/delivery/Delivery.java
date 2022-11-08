package flowerstore.delivery;

import flowerstore.item.Item;

import java.util.List;

public interface Delivery {
    String deliver(List<Item> items);
}
