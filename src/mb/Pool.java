package mb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pool implements Runnable {
    static int num;
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        num++;
        String way;
        way = ("C:\\Users\\kasper084\\Desktop\\tst\\" + num + ".txt");
        try (FileOutputStream zero = new FileOutputStream(way)) {
            for (int mb = 0; mb <= 1024; mb++) {
                zero.write('0');
                System.out.println(Thread.currentThread().getName());
                long finishTime = System.currentTimeMillis();
                System.out.println(finishTime - startTime);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
