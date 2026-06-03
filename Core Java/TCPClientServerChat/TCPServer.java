import java.io.*;
import java.net.*;

public class TCPServer {

    public static void main(String[] args) {

        try {

            ServerSocket serverBox =
                    new ServerSocket(5000);

            System.out.println(
                    "Server Started...");

            Socket clientBox =
                    serverBox.accept();

            System.out.println(
                    "Client Connected");

            BufferedReader receiveData =
                    new BufferedReader(
                            new InputStreamReader(
                                    clientBox.getInputStream()));

            PrintWriter sendData =
                    new PrintWriter(
                            clientBox.getOutputStream(),
                            true);

            String message =
                    receiveData.readLine();

            System.out.println(
                    "Client : " + message);

            sendData.println(
                    "Hello from Server");

            clientBox.close();
            serverBox.close();

        } catch (Exception error) {

            System.out.println(error);
        }
    }
}