import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        // if (b == 0) {
        //     System.out.println("Error: Cannot divide by zero.");
        //     return 0;
        // }
        b = 0;
        return a / b;
    }
}

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("=== Simple Calculator ===");

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        int result = 0;
        boolean valid = true;

        switch (choice) {
            case 1:
                result = calc.add(num1, num2);
                break;
            case 2:
                result = calc.subtract(num1, num2);
                break;
            case 3:
                result = calc.multiply(num1, num2);
                break;
            case 4:
                result = calc.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice.");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
