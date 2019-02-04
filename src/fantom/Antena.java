package fantom;

public class Antena extends Phone{
    public void call() {
        String [] numberBase = new String[4];
        Phone[] phones = new Phone[4];
        
        for (int startCalling = 0; startCalling < numberBase.length; startCalling++) {
            if (numberBase[startCalling].equals(number)) {
                phones[startCalling].heyPhoneIsCalling();
            }

        }

    }

    @Override
    public void heyPhoneIsCalling() {}
}
