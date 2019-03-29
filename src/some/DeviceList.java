package some;


public abstract  class DeviceList extends Device{

    public static void main(String[] args) {
        Phone phone = new Phone();
        AnotherBigLaptop anotherBigLaptop = new AnotherBigLaptop();
        AndAnotherBigLaptop andAnotherBigLaptop = new AndAnotherBigLaptop();
        System.out.println("Phone screen is" +"\t" + phone.setScreen());
        System.out.println("This laptop battery size is" + "\t" + anotherBigLaptop.getBatterySize() + "mAh");
        System.out.println("And that laptop battery size is" +
                "\t" + andAnotherBigLaptop.getBatterySize()+ "mAh" + "\ttoo");
    }
}
