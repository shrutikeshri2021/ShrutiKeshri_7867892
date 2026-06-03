import java.util.Scanner;

public class MultiplicationTable {
     public static void main(String[] args){
        System.out.println("Enter a number for table: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a==0){
            System.out.println("0");
        }
        else{
            int i=1;
            for(i=1;i<=10;i++){

            System.out.println(a + " * "+ i+" = "+ a*i);
            }
        }
        sc.close();
    }
}
