public class HandleException {
    public static void main(String[] args) {
        String numberString = "123a"; // This string is not a valid integer
        try {
            int number = Integer.parseInt(numberString);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Unable to parse '" + numberString + "' as an integer.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
