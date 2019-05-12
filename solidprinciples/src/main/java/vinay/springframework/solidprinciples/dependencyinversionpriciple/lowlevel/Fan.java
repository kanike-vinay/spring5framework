package vinay.springframework.solidprinciples.dependencyinversionpriciple.lowlevel;

import vinay.springframework.solidprinciples.dependencyinversionpriciple.highlevel.Swicthable;

/**
 * @author kanike
 */
public class Fan implements Swicthable {
    @Override
    public void turnOn() {
        System.out.println("Fan :: Fan turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan :: Fan turned off...");
    }
}
