package vinay.springframework.solidprinciples.dependencyinversionpriciple.lowlevel;

import vinay.springframework.solidprinciples.dependencyinversionpriciple.highlevel.Swicthable;

/**
 * @author kanike
 */
public class LightBulb implements Swicthable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb :: bulb turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb :: bulb turned off...");
    }
}
