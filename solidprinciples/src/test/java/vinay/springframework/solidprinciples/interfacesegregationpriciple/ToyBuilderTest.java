package vinay.springframework.solidprinciples.interfacesegregationpriciple;

import org.junit.Test;
import vinay.springframework.solidprinciples.interfacesegregationprinciple.ToyBuilder;
import vinay.springframework.solidprinciples.interfacesegregationprinciple.ToyCar;
import vinay.springframework.solidprinciples.interfacesegregationprinciple.ToyHouse;
import vinay.springframework.solidprinciples.interfacesegregationprinciple.ToyPlane;

/**
 * @author kanike
 */
public class ToyBuilderTest {

    @Test
    public void buildToyHouseTest() throws Exception{
        ToyHouse toyHouse = ToyBuilder.buildToyHouse();
        System.out.println("ToyHouse :: " + toyHouse);
    }

    @Test
    public void  buildToyCarTest() throws  Exception{
        ToyCar toyCar = ToyBuilder.buildToyCar();
        System.out.println("ToyCar :: " + toyCar);
    }

    @Test
    public void  buildToyPlaneTest() throws Exception{
        ToyPlane toyPlane = ToyBuilder.buildToyPlane();
        System.out.println("ToyPlane :: " + toyPlane);
    }
}
