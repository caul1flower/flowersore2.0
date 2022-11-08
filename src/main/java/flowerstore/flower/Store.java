package flowerstore.flower;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public boolean search(double price) {
        for (FlowerBucket bucket : flowerBuckets) {
            if (bucket.getPrice() <= price) {
                return true;
            }
        }
        return false;
    }

    public void addBucket(FlowerBucket flowerBucket) {
        this.flowerBuckets.add(flowerBucket);
    }
}
