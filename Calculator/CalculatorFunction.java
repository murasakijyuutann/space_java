package Calculator;

public abstract class CalculatorFunction {

    // Enum representing possible operations
    public enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE;
    }

    // (Optional) Store the selected operation if needed
    // private Operation operation; // Uncomment if you plan to use this later

    // Static methods for basic calculator operations
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // You might also throw an exception instead
        }
        return a / b;
    }
}

    // (Optional) Method to set the operation if needed
    // public void setOperation(Operation operation) {
    //     this.operation = operation;
    // }