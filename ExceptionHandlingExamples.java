public class ExceptionHandlingExamples {
    public static void main(String[] args) {

        clearLine();
        // Example 1: Handling ArithmeticException
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
        clearLine();
        // Example 2: Handling ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            int value = arr[10]; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        clearLine();
        // Example 3: Handling NullPointerException
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
        clearLine();
        // Example 4: Handling NumberFormatException
        try {
            String invalidNumber = "abc";
            int num = Integer.parseInt(invalidNumber); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        }
        clearLine();
        // Example 5: Handling multiple exceptions
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        clearLine();
    }

    public static void clearLine() {
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }
}
