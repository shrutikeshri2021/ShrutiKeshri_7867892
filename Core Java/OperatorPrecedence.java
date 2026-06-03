public class OperatorPrecedence {
        public static void main(String[] args) {

        System.out.println("Operator Precedence\n");
        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("Explanation: 5 * 2 first = (10), then + 10 = 20\n");

        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("Explanation: Brackets first = (15), then * 2 = 30\n");
        
        // Multiple operations
        int result3 = 10 + 5 * 2 - 3 / 3;
        System.out.println("10 + 5 * 2 - 3 / 3 = " + result3);
        System.out.println("Step 1: 5 * 2 = 10");
        System.out.println("Step 2: 3 / 3 = 1");
        System.out.println("Step 3: 10 + 10 - 1 = 19\n");
        
        //Division
        double result4 = 7 / 2;
        double result5 = 7.0 / 2;
        System.out.println("7 / 2 = " + result4 );
        System.out.println("7.0 / 2 = " + result5 );
    }

}
