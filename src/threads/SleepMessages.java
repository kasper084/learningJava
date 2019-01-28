package threads;

public class SleepMessages {
    //from java documentation
    public static void main(String args[])
            throws InterruptedException {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (int message = 0;
             message < importantInfo.length;
             message++) {
            //1000 milliseconds in 1 second
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                // We've been interrupted: no more messages.
                return;
            }
            //Print a message
            System.out.println(importantInfo[message]);
        }
    }
}
