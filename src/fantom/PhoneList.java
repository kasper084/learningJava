package fantom;

public class PhoneList {
    public static void main(String[] args) {

        Nokia3310 nokia = new Nokia3310();
        System.out.println("Nokia3310 screen size: " + nokia.getScreenSize());
        nokia.call("123-45-67");
        nokia.sendSMS("567-78-89", "text message");
        System.out.println("----------------------------------");
        IPhone iphone = new IPhone();
        System.out.println("IPhone screen size: " + iphone.getScreenSize());
        iphone.call("123-45-67");
        iphone.sendSMS("567-78-89", "text message");
        System.out.println("----------------------------------");
        IPhone5 iphone5 = new IPhone5();
        System.out.println("IPhone5 screen size: " + iphone5.getScreenSize());
        iphone5.call("123-45-67");
        iphone5.sendSMS("567-78-89", "text message");
        Antena antena = new Antena();

    }
}
