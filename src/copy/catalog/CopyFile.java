package copy.catalog;

import java.io.*;

public interface CopyFile {
     static void copy(File src, File dest) throws Exception{
        try (
                InputStream in = new FileInputStream(src);
                OutputStream out = new FileOutputStream(dest);
        ) {
            int read;
            byte[] buff = new byte[1024];
            do{
                read = in.read(buff);
                if (read > 0){
                    out.write(buff, 0, read);
                }

            }while (read > 0);
        }

     }
}
