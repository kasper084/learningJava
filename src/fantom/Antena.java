package fantom;

public class Antena extends Phone{
    public void call() {
        String [] numberBase = new String[10];
        numberBase[0] = ("0001");
        numberBase[1] = ("0002");
        numberBase[2] = ("0003");
        numberBase[3] = ("0004");

        String number;
        for (int fill = 0; fill < numberBase.length; fill++) {
            number = numberBase[fill];
            if (numberBase[fill].equals(number)) {
                heyPhoneIsCalling();
            }
        }

    }

    @Override
    public void heyPhoneIsCalling() {}
}
