package flowerstore.flower;

public class Tulip extends Flower {
    public Tulip(){
        super();
        this.setColor(FlowerColor.RED);
        this.setPrice(14.0);
        this.setFlowerType(FlowerType.TULIP);
    }
    @Override
    public String toString() {
        return "Tulip";
    }
}
