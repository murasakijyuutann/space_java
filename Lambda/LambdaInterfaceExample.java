package Lambda;

public class LambdaInterfaceExample {
    public static void main(String[] args) {
        // Basic math operations
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> b != 0 ? a / b : 0;

        // More math operations
        MathOperation modulus = (a, b) -> a % b;
        MathOperation power = (a, b) -> (int) Math.pow(a, b);
        MathOperation min = (a, b) -> Math.min(a, b);
        MathOperation max = (a, b) -> Math.max(a, b);

        // Comparison logic
        MathOperation isEqual = (a, b) -> (a == b) ? 1 : 0;
        MathOperation isGreater = (a, b) -> (a > b) ? 1 : 0;

        // Zero check (b is ignored)
        MathOperation isZero = (a, b) -> (a == 0) ? 1 : 0;

        // Run and print examples
        System.out.println("Addition: " + addition.operation(10, 5));
        System.out.println("Subtraction: " + subtraction.operation(10, 5));
        System.out.println("Multiplication: " + multiplication.operation(10, 5));
        System.out.println("Division: " + division.operation(10, 5));
        System.out.println("Modulus: " + modulus.operation(10, 3));
        System.out.println("Power: " + power.operation(2, 5)); // 2^5 = 32
        System.out.println("Min: " + min.operation(10, 5));
        System.out.println("Max: " + max.operation(10, 5));
        System.out.println("Is Equal: " + isEqual.operation(10, 10)); // 1 for true
        System.out.println("Is Greater: " + isGreater.operation(10, 5)); // 1 for true
        System.out.println("Is Zero (a=0): " + isZero.operation(0, 0));
    }

    // Functional interface
    interface MathOperation {
        int operation(int a, int b);
    }
}
