import java.lang.reflect.Method;

public class ReflectionDemo {

    public void showDetails() {

        System.out.println("Reflection Working");
    }

    public static void main(String[] args) {

        try {

            Class<?> classInfo =
                    Class.forName("ReflectionDemo");

            Object objectInfo =
                    classInfo
                            .getDeclaredConstructor()
                            .newInstance();

            Method[] methodList =
                    classInfo.getDeclaredMethods();

            System.out.println("Methods Present:");

            for (Method item : methodList) {

                System.out.println(item.getName());
            }

            Method selectedMethod =
                    classInfo.getDeclaredMethod(
                            "showDetails");

            selectedMethod.invoke(objectInfo);

        } catch (Exception error) {

            System.out.println(error);
        }
    }
}