package electrocar;

public abstract class CarList extends Electrocar{

    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        System.out.println(tesla.getBatteryLeft());
        System.out.println(tesla.getPowerUse());
        System.out.println(tesla.getName());

        System.out.println("\\(o_o)/");

    }
}
