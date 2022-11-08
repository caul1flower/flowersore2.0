package flowerstore.flower;

public class Rose extends Flower {
    public Rose(){
        super();
        this.setColor(FlowerColor.RED);
        this.setPrice(15.0);
        this.setFlowerType(FlowerType.ROSE);
    }
    @Override
    public String toString() {
        return "Rose";
    }
}
