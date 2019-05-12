package vinay.springframework.solidprinciples.interfacesegregationprinciple;

/**
 * @author kanike
 */
public class ToyBuilder {
    public static ToyHouse buildToyHouse() {
        ToyHouse toyHouse = new ToyHouse();
        toyHouse.setPrice(10000.00);
        toyHouse.setColor("Blue");
        return toyHouse;
    }

    public static ToyCar buildToyCar() {
        ToyCar toyCar = new ToyCar();
        toyCar.setPrice(15000.00);
        toyCar.setColor("Black");
        toyCar.move();
        return toyCar;
    }

    public static ToyPlane buildToyPlane() {
        ToyPlane toyPlane = new ToyPlane();
        toyPlane.setPrice(20000.00);
        toyPlane.setColor("White");
        toyPlane.move();
        toyPlane.fly();
        return toyPlane;
    }
}
