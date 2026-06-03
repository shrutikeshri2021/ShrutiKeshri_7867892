import java.util.Scanner;
public class ReverseString {
    

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String original = sc.nextLine();
        
        // Method 1: Using StringBuilder
        String reversed1 = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed (StringBuilder): " + reversed1);
        
        // Method 2: Using loop
        String reversed2 = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed2 += original.charAt(i);
        }
        System.out.println("Reversed (Loop): " + reversed2);
        
        sc.close();
    }
}
