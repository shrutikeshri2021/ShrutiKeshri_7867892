import java.io.FileWriter;
import java.util.Scanner;

public class FileWriting {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter text: ");
        String textData = userInput.nextLine();

        FileWriter fileObj = new FileWriter("output.txt");
        fileObj.write(textData);
        fileObj.close();

        System.out.println("Data written to output.txt");
    }
}