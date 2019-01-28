package electrocar;

public class Electrocar extends Capacity {

    private String name;
    private String number;
    private boolean on;
    private double powerUse;

    public Electrocar(){
        setOn();
        if (isOn()) {
            if (getSpeed() >= 100 && setClimateOn(true)) {
                powerUse = getPowerUse() * 1.1;
            }

            if (getSpeed() <= 80 && setClimateOn(true)) {
                powerUse = getPowerUse() * 0.9;
            }

            if (getBatterySize() > 0) {

            }

            if (getBatteryLeft() <= getBatterySize() / 2) {
                setOff();
            }
        }
        setOff();
    }

    public double getPowerUse() {
        powerUse = (getTime() * getSpeed())/100;
        return powerUse;
    }

    public double addPowerUse(){
        this.powerUse += powerUse;
        return powerUse;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return on;
    }

    public boolean setOn() {
        return on = true;

    }

    public boolean setOff() {
        return on = false;
    }

    public boolean setClimateOn(boolean button) {
       return false;
    }

    public String getNumber(){
        return number;
    }

}

