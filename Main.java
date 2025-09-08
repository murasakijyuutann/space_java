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

    public int divide (int a, int b) {
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int resultAdd = calc.add(3, 4);
        int resultMultiply = calc.multiply(3, 4);
        int resultDivide = calc.divide(4, 8);
        int resultSubtract = calc.subtract(10, 5);

        System.out.println("=========================================");
        System.out.println(resultAdd);
        System.out.println("=========================================");
        System.out.println(resultMultiply);
        System.out.println("=========================================");
        System.out.println(resultDivide);
        System.out.println("=========================================");
        System.out.println(resultSubtract);
        System.out.println("=========================================");
    }
}