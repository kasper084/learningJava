package electrocar;

public class Tesla extends Electrocar{

    public Tesla() {
        Electrocar tesla = new Electrocar();
        setOn();
        setClimateOn();
    }

    public String getNumber() {
        String number = "%s";
        return number;
    }

    public String getName() {
        String name = "model 3";
        return name;
    }

    public boolean isOn() {
        return true;
    }

    public double getBatterySize() {
        double batterySize = 5000;
        return batterySize;
    }

    public double getSpeed() {
        double speed = 120;
        return speed;
    }

    public double getTime() {
        double hours = 3.5;
        return hours;
    }

    public boolean setClimateOn() {
        return true;
    }

}

