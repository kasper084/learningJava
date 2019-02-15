package pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Swim {
    public static void main (String[] args) /*throws Exception*/ {

        ExecutorService pool = Executors.newFixedThreadPool(10);

        byte start = 0;
        //int start = 0;
        while (start != 127) {
            pool.submit(new FixedPool());
            start++;
           //System.out.println(start);
           //Thread.sleep(100);
        }

        pool.shutdown();
    }
}
