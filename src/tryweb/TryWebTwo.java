package tryweb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TryWebTwo {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.those-who-serve.com/");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        try {
            BufferedReader buffr = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buff = new char[1024];
            StringBuilder sbuilder = new StringBuilder();
            int reader;

            do {
                if (((reader = buffr.read(buff))> 0)) {
                    sbuilder.append(new String(buff, 0, reader));
                }

            } while (reader > 0);

            System.out.println(sbuilder.toString());

        } finally {
            http.disconnect();
        }
    }
}
