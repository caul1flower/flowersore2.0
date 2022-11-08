package flowerstore.item;

public class BasketDecorator extends ItemDecorator{
    private Item item;

    @Override
    public double getPrice() {
        return 4+item.getPrice();
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "in a basket";
    }
}
