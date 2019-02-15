package electrocar;

public class Capacity implements BatterySize{

    private double speed;
    private double time;
    private double powerUse;

    public Capacity() {
            if (getSpeed() >= 100 && setClimateOn(true)) {
                powerUse = getPowerUse() * 1.1;
            }

            if (getSpeed() <= 80 && setClimateOn(true)) {
                powerUse = getPowerUse() * 0.9;
            }

            if (getBatterySize() > 0) {

            }

            if (getBatteryLeft() <= getBatterySize() / 2) {
            }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getTime() {
        return time;
    }

    @Override
    public double getBatterySize() {
        return 0;
    }
    public double getBatteryLeft(){
        double batteryLeft = getBatterySize() - getPowerUse();
        return batteryLeft;
    }

    public double getPowerUse(){
        return powerUse;
    }
    public boolean setClimateOn(boolean button) {
        return false;
    }
}
