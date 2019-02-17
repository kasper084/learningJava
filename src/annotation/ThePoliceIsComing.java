package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ThePoliceIsComing {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException  {

        HeyCheckMyAnnotation hey = new HeyCheckMyAnnotation();

        Class<?> wildCat = hey.getClass();
        Method[] meth = wildCat.getDeclaredMethods();

        for (Method find : meth) {
            if (find.isAnnotationPresent(SuspiciousAnnotation.class)) {
                SuspiciousAnnotation annotation = find.getAnnotation(SuspiciousAnnotation.class);
                find.invoke(hey, annotation.a(),annotation.b());
            }
        }

    }

}
