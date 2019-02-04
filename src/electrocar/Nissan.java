package electrocar;

public class Nissan extends Electrocar{
    public Nissan() {
        Electrocar nissan = new Electrocar();
        getPowerUse();
    }

    public String getName() {
        String name = "model 2.0";
        return name;
    }

    public String getNumber() {
        return "%s";
    }

    public boolean isOn() {
        return true;
    }

    @Override
    public double getBatterySize() {
        double batterySize = 3500;
        return batterySize;
    }


    public double getSpeed() {
        double speed = 80;
        return speed;
    }

    public double getTime() {
        double hours = 2.1;
        return hours;
    }

    public boolean setClimateOn(boolean button) {
        return false;
    }
}
