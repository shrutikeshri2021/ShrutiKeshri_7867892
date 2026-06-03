import java.util.Scanner;
public class LeapYearChecker {
        public static void main(String[] args){
        System.out.println("Enter a year to check if it is Leap year or not ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();

        if(a % 400 ==0 ){
            System.out.println("LeapYear");
        }
        else if (a % 100 == 0) {
             System.out.println("not a LeapYear");
        } else if (a % 4 == 0) {
             System.out.println("LeapYear");
        } else {
             System.out.println(" not a LeapYear");
        }

        sc.close();
        }
}