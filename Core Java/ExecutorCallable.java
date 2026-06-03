
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCallable {

    public static void main(String[] args) {

        try {

            ExecutorService taskManager =
                    Executors.newFixedThreadPool(2);

            Callable<String> firstTask =
                    () -> "First Task Completed";

            Callable<String> secondTask =
                    () -> "Second Task Completed";

            Future<String> resultOne =
                    taskManager.submit(firstTask);

            Future<String> resultTwo =
                    taskManager.submit(secondTask);

            System.out.println(resultOne.get());

            System.out.println(resultTwo.get());

            taskManager.shutdown();

        } catch (Exception error) {

            System.out.println(error);
        }
    }
}