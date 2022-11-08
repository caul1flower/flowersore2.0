package flowerstore.flower;

import flowerstore.item.Item;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack fp) {
        this.flowerPacks.add(fp);
    }
    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
    @Override
    public String getDescription() {
        return "A bucket of flowers.";
    }
}
