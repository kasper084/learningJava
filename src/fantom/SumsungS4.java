package fantom;

public class SumsungS4 extends Phone {
    public SumsungS4() {
        System.out.println("SumsungS4 constructor");
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("SumsungS4 class is sending sms " + message + "Hallo" + " to " + number);
    }

    @Override
    public void heyPhoneIsCalling() {
        System.out.println("hi!");

    }
}
