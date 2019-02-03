package electrocar;

public class Capacity implements BatterySize{

    private double speed;
    private double time;
    private double powerUse;

    public Capacity() {
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
