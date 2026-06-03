import java.io.BufferedReader;
import java.io.FileReader;

public class FileReading {
    public static void main(String[] args) throws Exception {

        BufferedReader readerObj =
                new BufferedReader(new FileReader("output.txt"));

        String currentLine;

        while ((currentLine = readerObj.readLine()) != null) {
            System.out.println(currentLine);
        }

        readerObj.close();
    }
}