package fantom;

public abstract class Phone {

    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    protected int numberOfCalls;
    protected int numberOfSMS;
    protected String number;

    public Phone() {
        System.out.println("Phone constructor");
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getNumberOfCalls() {
        return numberOfCalls;
    }

    public int getNumberOfSMS() {
        return numberOfSMS;
    }


    public void call(String number) {
        System.out.println("Phone class is calling " + number);
        numberOfCalls++;
    }

    public void sendSMS(String number, String message) {
        numberOfSMS++;
    }

    public abstract void heyPhoneIsCalling();
}
