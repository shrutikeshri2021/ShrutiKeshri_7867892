public class VirtualThreads {

    public static void main(String[] args) {

        long startTime =
                System.currentTimeMillis();

        for (int threadNumber = 1;
             threadNumber <= 10000;
             threadNumber++) {

            int currentThread =
                    threadNumber;

            Thread.startVirtualThread(() -> {

                System.out.println(
                        "Virtual Thread "
                                + currentThread);
            });
        }

        long endTime =
                System.currentTimeMillis();

        System.out.println(
                "Execution Time : "
                        + (endTime - startTime)
                        + " ms");
    }
}