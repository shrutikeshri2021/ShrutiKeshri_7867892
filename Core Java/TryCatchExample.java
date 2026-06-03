import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int valueOne = inputData.nextInt();

        System.out.print("Enter second number: ");
        int valueTwo = inputData.nextInt();

        try {
            int answer = valueOne / valueTwo;
            System.out.println("Result: " + answer);
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}