package vinay.springframework.solidprinciples.interfacesegregationprinciple;

/**
 * @author kanike
 */
public class ToyCar implements Toy, Movable {
    private double price;
    private String color;

    @Override
    public void move() {
        System.out.println("ToyCar :: Start moving the car");
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ToyCar{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
