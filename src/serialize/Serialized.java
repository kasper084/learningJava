package serialize;

import annotation.Save;
import annotation.SaveTo;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicBoolean;


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
        StringBuilder sb = new StringBuilder();
        Class<?> wildCat = some.getClass();
        Field[] fields = wildCat.getDeclaredFields();
        for (Field findField : fields) {
            if (findField.isAnnotationPresent(Save.class)) {
                findField.setAccessible(true);
                sb.append(findField.getName() + "=");
                if (findField.getType() == String.class)
                    sb.append(findField.get(some));
                if (findField.getType() == AtomicBoolean.class)
                    sb.append(findField.get(some));
                if (findField.getType().isArray()) {
                    int l = Array.getLength(findField.get(some));
                    for (int start = 0; start < l; start++) {
                        Object arr = Array.getInt(findField.get(some), start);
                        sb.append(arr);
                    }
                }
                sb.append("\n");
            }

        }
        String s = sb.toString();
        System.out.println(s);
        PrintWriter printWriter = new PrintWriter(path);
        printWriter.print(s);
        return s;
    }

    @SaveTo(path = "C:/Users/kasper084/Desktop/some1.txt")
    public static String deserialized(Object some) throws Exception {
        Class<?> wildCat = some.getClass();
        Field[] fields = wildCat.getDeclaredFields();
        for (Field findField : fields) {
            if (findField.isAnnotationPresent(Save.class)) {
                findField.setAccessible(true);
                String text = Files.readString(Paths.get(path));

            }

        }
        return wildCat.getFields().toString();
    }

}
