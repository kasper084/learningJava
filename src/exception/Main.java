package exception;

public class Main {
    public static void main(String[] args) {

        String url = "para1=value1&param2=value2&param3=value3";
        URLtest urLtest = new URLtest();
        try {
            urLtest.ifURLisCorrect(url);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
