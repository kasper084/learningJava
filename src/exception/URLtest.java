package exception;

public class URLtest {
    public void ifURLisCorrect(String url) throws Exception{

        if(url.endsWith("&")) throw new SomeException("Forget parameter = value.");
        String[] url1 = url.split("&");
        for (int i = 0; i < url1.length; i++) {
            System.out.println(url1[i]);
            int num = url1[i].indexOf("=");
            if (num != -1) {
                if (url1[i].indexOf("=", num+1) != -1) throw new SomeException("Too much sign of '='.");
            }
            if (url1[i].isEmpty())       throw new SomeException("Too much sign of '&'.");
            if (url1[i].endsWith("="))   throw new SomeException("Forget value.");
            if (url1[i].startsWith("=")) throw new SomeException("Forget parameter.");
            if (url1[i].length() < 3)    throw new SomeException("Forget parameter = value.");
        }
        System.out.println("Right!");
    }
}