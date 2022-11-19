package flowerstore.flower;

import flowerstore.item.Item;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Enabled @Entity
public class Flower extends Item {
    @Id @GeneratedValue
    private int Id;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;
    protected String description = "Just a flower.";

    public String getColor() {
        return color.toString();
    }
    public Flower(FlowerColor color, double price, double sepalLength) {
        this.color = color;
        this.price = price;
        this.sepalLength = sepalLength;
    }
    public Flower(FlowerType type, FlowerColor color, double sepalLength, double price) {
        this.flowerType = type;
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;
    }

    public Flower(int id, FlowerType type, FlowerColor color, double sepalLength, double price) {
        this.Id = id;
        this.flowerType = type;
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;

    }
    public Flower(double sepalLength, String color, double price) {
        this.price = price;
        this.sepalLength = sepalLength;
        switch (color) {
            case "red" -> this.color = FlowerColor.RED;
            case "blue" -> this.color = FlowerColor.BLUE;
            case "green" -> this.color = FlowerColor.GREEN;
            default -> this.color = FlowerColor.WHITE;
        }
    }
}