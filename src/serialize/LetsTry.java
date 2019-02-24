package serialize;


import java.lang.reflect.Array;

public class LetsTry  {
    public static void main (String[] args) throws Exception {
        SomeClass some = new SomeClass();
        some.setAboolean(null);
        some.setTryToChangeMe("WHAT?!");
        some.setArr((int[]) Array.newInstance(int.class, some.tryToChangeMe.length()));
        String ssc = Serialized.serialized(some);
        String dsc = Serialized.deserialized(some);
        System.out.println(ssc.getBytes().length + "bytes" +
                "\t\\(o_o)/\t" +
                 dsc.getBytes().length + "bytes");
    }
}

