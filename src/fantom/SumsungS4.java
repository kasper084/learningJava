package fantom;

public class SumsungS4 extends Phone {
    public SumsungS4() {
        System.out.println("SumsungS4 constructor");
        number = "0004";
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("SumsungS4 class is sending sms " + message + "Hallo" + " to " + number);
    }

}
