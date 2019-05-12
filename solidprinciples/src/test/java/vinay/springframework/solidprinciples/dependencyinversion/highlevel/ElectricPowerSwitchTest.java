package vinay.springframework.solidprinciples.dependencyinversion.highlevel;

import org.junit.Test;
import vinay.springframework.solidprinciples.dependencyinversionpriciple.highlevel.ElectricPowerSwitch;
import vinay.springframework.solidprinciples.dependencyinversionpriciple.highlevel.Swicthable;
import vinay.springframework.solidprinciples.dependencyinversionpriciple.highlevel.Switch;
import vinay.springframework.solidprinciples.dependencyinversionpriciple.lowlevel.Fan;
import vinay.springframework.solidprinciples.dependencyinversionpriciple.lowlevel.LightBulb;

/**
 * @author kanike
 */
public class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception{
        Swicthable swicthableBulb = new LightBulb();
        Switch switchPowerBulb = new ElectricPowerSwitch(swicthableBulb,true);
        switchPowerBulb.press();
        switchPowerBulb.press();

        Swicthable swicthableFan = new Fan();
        Switch swicthablPowerFan = new ElectricPowerSwitch(swicthableFan,true);
        swicthablPowerFan.press();
        swicthablPowerFan.press();
    }
}
