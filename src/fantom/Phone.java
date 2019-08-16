package fantom;

public abstract class Phone {

    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    protected String number;
    private int callsMade = 0;
    private int smsSent = 0;

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


    public void call(String number) {
        callsMade++;
        System.out.println("Phone class is calling " + number);
    }

    public void sendSMS(String number, String message) {
        smsSent++;
    }

    public int getCallsMade() {
        return callsMade;
    }

    public int getSmsSent() {
        return smsSent;
    }
}
