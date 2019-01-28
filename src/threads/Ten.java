package threads;

public class Ten implements Runnable {


    public void run() {

        for (int treadNum = 1; treadNum <= 10; treadNum++) {
            System.out.println(treadNum + Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        int threads = 10;
        for (int start = 1; start <= threads; start++) {
            (new Thread(new Ten())).start();
        }
    }
}