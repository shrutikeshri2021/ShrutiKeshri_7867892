import java.io.*;
import java.net.*;

public class TCPClient {

    public static void main(String[] args) {

        try {

            Socket socketBox =
                    new Socket("localhost", 5000);

            BufferedReader receiveData =
                    new BufferedReader(
                            new InputStreamReader(
                                    socketBox.getInputStream()));

            PrintWriter sendData =
                    new PrintWriter(
                            socketBox.getOutputStream(),
                            true);

            sendData.println(
                    "Hello from Client");

            String reply =
                    receiveData.readLine();

            System.out.println(
                    "Server : " + reply);

            socketBox.close();

        } catch (Exception error) {

            System.out.println(error);
        }
    }
}