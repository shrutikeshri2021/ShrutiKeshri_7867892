import java.util.*;
public class RecursiveFibonacci {
    
    // Recursive method
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive call
    }
    
    public static void main(String[] args) {
        System.out.println("number:");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("First n Fibonacci numbers:");
        for (int i = 0; i < a; i++) {
            System.out.println("fib(" + i + ") = " + fibonacci(i));
        }
        sc.close();
    }
}