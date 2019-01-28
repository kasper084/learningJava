package pool;

public class FixedPool implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
