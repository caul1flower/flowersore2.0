package flowerstore.item;

public abstract class ItemDecorator extends Item{
    protected Item item;

    public abstract double getPrice();
}
