public class PatternMatchingSwitch {

    static void checkType(Object obj) {

        switch (obj) {

            case Integer n ->
                    System.out.println("Integer Value");

            case String s ->
                    System.out.println("String Value");

            case Double d ->
                    System.out.println("Double Value");

            default ->
                    System.out.println("Other Type");
        }
    }

    public static void main(String[] args) {

        checkType(10);
        checkType("Hello");
        checkType(25.5);
    }
}