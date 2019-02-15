package tryweb;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class TryWeb {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("www.those-who-serve.com",80);
        try {
            PrintWriter pwriter = new PrintWriter(socket.getOutputStream());
            pwriter.println("GET / HTTP/1.1");
            pwriter.println("Host: www.those-who-serve.com");
            pwriter.println("");
            pwriter.flush();

            InputStream stream = socket.getInputStream();
            byte[] buff = new byte[1024];
            int reader;

            do {
                if ((reader = stream.read(buff)) > 0) {
                    System.out.println(new String(buff, 0, reader));
                }

            } while (reader > 0);

        }

        finally {
            socket.close();
        }

    }
}
