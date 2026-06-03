import java.util.Scanner;

public class Factorial {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        int fact=1;
        if(a<=0){
            System.out.println("enter correct no");
        }
        else{
            for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        }
        
        sc.close();
    }
}
