package reflection;

import annotation.SaveTo;
import annotation.Saver;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SaveTo(path = "C:/Users/kasper084/Desktop/some.txt")
public class SomeText {
    //String shakespeare = "Old king has died";
    byte shakespeare = 00101;

    @Saver
    public void saveSomeText(String path) throws IOException{
        FileWriter william = new FileWriter(path);
        try {
            william.write(shakespeare);
        } finally {
            william.close();
        }
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        SomeText poem = new SomeText();
        Class<?> wildCat = poem.getClass();

        if (wildCat.isAnnotationPresent(SaveTo.class)) {
            SaveTo save = wildCat.getAnnotation(SaveTo.class);
            String path = save.path();
            Method[] book = wildCat.getDeclaredMethods();
            for (Method find : book) {
                if (find.isAnnotationPresent(Saver.class)) {
                    find.invoke(poem, path);
                }
            }
        }
    }
}
