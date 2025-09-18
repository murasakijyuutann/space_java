package Lambda;

public class LambdaTest {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        GreetingService greetService = message -> System.out.println("Hello " + message);
        greetService.sayMessage("World");
    }

    // Functional interface
    interface GreetingService {
        void sayMessage(String message);
    }

}
