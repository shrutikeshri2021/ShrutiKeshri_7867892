import java.util.Arrays;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> nums =
                Arrays.asList(10, 15, 22, 31, 44, 57, 68);

        System.out.println("Even Numbers:");

        nums.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}