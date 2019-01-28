package copy.catalog;

import java.io.*;

public class Copy {

        File src = new File("");

        File dst = new File("");

     public void copy (File src, File dst) {

             try (

                     InputStream in = new FileInputStream(src);

                     OutputStream out = new FileOutputStream(dst);

             ) {
                 int read;
                 byte[] buff = new byte[1024];
                 do {
                     read = in.read(buff);
                     if (read > 0) {
                         out.write(buff, 0, read);
                     }

                 } while (read > 0);

             } catch (FileNotFoundException oooh) {
                 oooh.printStackTrace();

             } catch (IOException ohoho) {
                 ohoho.printStackTrace();

             }
     }
}

