package syn;

import java.text.MessageFormat;
import java.util.Arrays;

public class Sum {

    public static void main(String[] args) throws InterruptedException {
        int size = 100000000;
        for(int threadsAmount = 1; threadsAmount < 20; threadsAmount++){
            int[] arr = new int[size];
            Arrays.fill(arr, 1);
            Sumator[] threads = new Sumator[threadsAmount];
            for(int threadNumber = 0; threadNumber < threadsAmount; threadNumber++){
                int start = threadNumber * (size / threadsAmount);
                int end = (threadNumber + 1) * (size / threadsAmount) - 1;
                threads[threadNumber] = new Sumator(arr, start, end);
            }
            long result = 0;
            long startTime = System.currentTimeMillis();
            for(int threadNumber = 0; threadNumber < threadsAmount; threadNumber++){
                threads[threadNumber].run();
            }

            for(int threadNumber = 0; threadNumber < threadsAmount; threadNumber++){
                threads[threadNumber].join();
                result += threads[threadNumber].getSum();
            }
            startTime = System.currentTimeMillis() - startTime;
            System.out.println(MessageFormat.format("Threads {0}; Time {1}, Result {2}", threadsAmount, startTime, result));
        }
    }
}
