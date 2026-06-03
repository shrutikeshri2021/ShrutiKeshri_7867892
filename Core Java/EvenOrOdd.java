import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        System.out.println("Enter a number to check if it is even or odd");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
