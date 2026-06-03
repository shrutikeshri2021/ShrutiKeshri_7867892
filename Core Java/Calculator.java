import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a=sc.nextDouble();
        System.out.print("Enter second number: ");
        double b= sc.nextDouble();
        double c=0;
        System.out.println("choose any one option:\n 1.add\n 2.sub\n 3.mul\n 4.div\n");
        int Calculatorchoice= sc.nextInt();
        switch (Calculatorchoice){
        case 1:
            c= a + b;
            System.out.println(" answer is:" + " " + c);
            break;
        case 2:
            c=a-b;
            System.out.println(" answer is:" + " " + c);
            break;
        case 3:
            c= a*b;
            System.out.println(" answer is:" + " " + c);
            break;
        case 4:
            try {
                c = a/b;
                System.out.println("answer is:" + " " + c);
            } catch (Exception e) {
                System.out.println("error");
            }
            break;
        default:
            System.out.println("eneter correct option");
        }
        sc.close();
    }
}
