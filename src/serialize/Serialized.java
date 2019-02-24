package serialize;

import annotation.Save;
import annotation.SaveTo;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Serialized {

    public static String path;

    public static String getPath() {
        Class<?> wildCat = Serialized.class;
        Method[] methods = wildCat.getDeclaredMethods();
        for (Method findMethod : methods) {
            if (findMethod.isAnnotationPresent(SaveTo.class)) {
                path = findMethod.getAnnotation(SaveTo.class).path();
            }
        }
        return path;
    }

    public void setPath(){
        getPath();
        path = this.path;
    }

    @SaveTo(path = "C:/Users/kasper084/Desktop/some1.txt")
    public static String serialized(Object some) throws Exception {
        Serialized serialized = new Serialized();
        serialized.setPath();
        Class<?> wildCat = some.getClass();
        Field[] fields = wildCat.getDeclaredFields();
        for (Field findField : fields) {
            if (findField.isAnnotationPresent(Save.class)) {
                findField.setAccessible(true);
                OutputStream out = new FileOutputStream(path);
                ObjectOutputStream objOut = new ObjectOutputStream(out);
                objOut.writeObject(wildCat.getFields());
                objOut.close();
                out.close();
            }

        }
        return wildCat.getFields().toString();
    }

    @SaveTo(path = "C:/Users/kasper084/Desktop/some1.txt")
    public static String deserialized(Object some) throws Exception {
        Class<?> wildCat = some.getClass();
        Field[] fields = wildCat.getDeclaredFields();
        for (Field findField : fields) {
            if (findField.isAnnotationPresent(Save.class)) {
                findField.setAccessible(true);
                InputStream in = new FileInputStream(path);
                ObjectInputStream objIn = new ObjectInputStream(in);
                objIn.read();
                objIn.close();
                in.close();
            }

        }
        return wildCat.getFields().toString();
    }

}
