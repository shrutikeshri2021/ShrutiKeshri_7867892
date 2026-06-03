public class ByteCodeDemo {

    public void showMessage() {

        System.out.println("Bytecode Example");
    }

    public static void main(String[] args) {

        ByteCodeDemo demoObject =
                new ByteCodeDemo();

        demoObject.showMessage();
    }
}