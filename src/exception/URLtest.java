package exception;

import java.util.ArrayList;

public class URLtest {

    public static void main(String[] args) {

        IfURLisCorrect checkThisURL = new IfURLisCorrect();

        ArrayList<String> someUrls = new ArrayList<>();
        someUrls.add("ratata=tatatata&tata=ka&boooo=ooom");
        someUrls.add("=ratata=tatatata&tata=ka&boooo=ooom");
        someUrls.add("ratata=tatatata&tata==ka&boooo=ooom");

        for (int start = 0; start < someUrls.size(); start++) {
            try {

                if (checkThisURL.check(someUrls.get(start)) == true) {
                    System.out.println("yep");
                }
            } catch (SomeException oh) {
                System.out.println("nope");
                System.out.println(oh.getMessage());
            }
        }

    }

}
