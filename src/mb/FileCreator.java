package mb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileCreator {
    static int num = 10;

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        for (int start = 0; start < num; start++){
            pool.submit(new Pool());
        }
        pool.shutdown();
    }

}
