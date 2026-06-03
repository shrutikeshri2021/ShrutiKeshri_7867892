import java.util.Scanner;
public class ArraySumandAvg {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        // Read array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        // Calculate sum
        int sum = 0;
        for (int num : arr) {
            sum += num;  // sum = sum + num
        }
        
        // Calculate average
        double average = (double) sum / n;  // Cast to double for precision
        
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        
        sc.close();
    }

}
