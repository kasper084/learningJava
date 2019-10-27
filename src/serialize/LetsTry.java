package serialize;


import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicBoolean;

public class LetsTry  {
    public static void main (String[] args) throws Exception {
        SomeClass some = new SomeClass();
        some.setAboolean(new AtomicBoolean(true));
        some.setTryToChangeMe("WHAT?!");
        some.setArr((int[]) Array.newInstance(int.class, some.tryToChangeMe.length()));
        Serialized.serialized(some);
        Serialized.deserialized(some);

    }
}

