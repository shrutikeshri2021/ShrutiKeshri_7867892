import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
        public static void main(String[] args){

        Random rand = new Random();
        int randno = rand.nextInt(100) + 1; 

        Scanner sc = new Scanner(System.in);
        
        int a=0;;
        while(randno!=a){
            System.out.print("Enter number: ");
            a =sc.nextInt();
            if (randno<=a){
                System.out.println("too high");
            }
            else {
                System.out.println("too low");
            }
            

        }
        
                System.out.println("correct guess:" + randno);
            

        sc.close();
    }
}
