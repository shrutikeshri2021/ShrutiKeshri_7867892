import java.util.*;

public class LambdaExpressions {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Shruti");
        names.add("Riya");
        names.add("Ankit");
        names.add("Priya");
        names.add("Dev");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted Names:");

        for (String item : names) {
            System.out.println(item);
        }
    }
}