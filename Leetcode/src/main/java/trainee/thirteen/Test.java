package trainee.thirteen;

public class Test {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Thread 1")).start();
        System.out.println("Thread 0");
    }
}
