import java.util.Scanner;
public class GradeCalculator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
        String grade;
        
        // Nested if-else for grade determination
        if (marks >= 90 && marks <= 100) {
            grade = "A";
        } else if (marks >= 80 && marks <= 89) {
            grade = "B";
        } else if (marks >= 70 && marks <= 79) {
            grade = "C";
        } else if (marks >= 60 && marks <= 69) {
            grade = "D";
        } else if (marks >= 0 && marks < 60) {
            grade = "F (Fail)";
        } else {
            grade = "Invalid";
        }
        
        System.out.println("Grade: " + grade);
        sc.close();
    }
}