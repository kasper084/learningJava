package annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String path();
    // "C:/Users/kasper084/Desktop/some.txt";
}

