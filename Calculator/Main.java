package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Welcome to the Java Calculator! (^_^) ===");
        System.out.println("Available operations: add, subtract, multiply, divide");
        System.out.println("Type 'exit' to quit.");

        while (running) {
            System.out.print("\n> Enter operation: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Goodbye! (T_T)/~~~");
                break;
            }

            System.out.print("Enter first number: ");
            int a = getValidInt(scanner);

            System.out.print("Enter second number: ");
            int b = getValidInt(scanner);

            switch (input) {
                case "add":
                    System.out.println("Result: " + CalculatorFunction.add(a, b) + " ヽ(・∀・)ﾉ");
                    break;
                case "subtract":
                    System.out.println("Result: " + CalculatorFunction.subtract(a, b) + " (¬_¬)");
                    break;
                case "multiply":
                    System.out.println("Result: " + CalculatorFunction.multiply(a, b) + " (*^_^*)");
                    break;
                case "divide":
                    System.out.println("Result: " + CalculatorFunction.divide(a, b) + " (^_^;)");
                    break;
                default:
                    System.out.println("Invalid operation... (・_・ヾ");
            }
        }

        scanner.close();
    }

    private static int getValidInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid integer! (>_<): ");
            }
        }
    }
}
