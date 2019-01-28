package copy.catalog;

import java.io.File;

public class CopyFolder {

        static void copyFolder(File src, File dest) throws Exception{
           String[] files2copy = src.list();
           for (String file2copy: files2copy) {
               CopyFile.copy(new File(src, file2copy),
                       new File(dest, file2copy));
           }
        }
}



