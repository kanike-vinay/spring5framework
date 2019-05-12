package vinay.springframework.solidprinciples.dependencyinversionpriciple.highlevel;

/**
 * @author kanike
 */
public class ElectricPowerSwitch implements Switch {

    public Swicthable swicthable;
    public boolean on;

    public ElectricPowerSwitch(Swicthable swicthable, boolean on) {
        this.swicthable = swicthable;
        this.on = on;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        boolean checkOn = isOn();
        if(checkOn){
            swicthable.turnOff();
            this.on = false;
        }else{
            swicthable.turnOn();
            this.on = true;
        }
    }
}
