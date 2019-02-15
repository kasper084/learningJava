package copy.catalog;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CopyTen {


/*    static File src = new File("C:/Users/kasper084/Desktop/src/t2.mp3");
    static File dst = new File("C:/Users/kasper084/Desktop/dst/t2.mp3");*//*


    public void run() {
    }


    public static void main(String[] args) {

        */
/*int threads = 10;
        for (int start = 1; start <= threads; start++) {
            (new Thread(new CopyTen())).start();

        }*//*




        System.out.println("Copying in progress ... ");

        while (dst.length() * 100 / src.length() != 100) {
            Thread.yield();
            System.out.print((dst.length() * 100 / src.length()) + " ");
        }
        System.out.println();
        System.out.println("File has arrived!");

    }
*/

}
