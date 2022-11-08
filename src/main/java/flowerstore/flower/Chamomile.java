package flowerstore.flower;

public class Chamomile extends Flower {
    public Chamomile(){
        super();
        this.setColor(FlowerColor.WHITE);
        this.setPrice(10.0);
        this.setFlowerType(FlowerType.CHAMOMILE);
    }
    @Override
    public String toString() {
        return "Chamomile";
    }
}
