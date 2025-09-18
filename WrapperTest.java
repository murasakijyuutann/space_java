public class WrapperTest {
    public static void main(String[] args) {
        int primitiveInt = 42;
        double primitiveDouble = 3.14;

        // Autoboxing: Converting primitive types to their corresponding wrapper classes
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        Double wrappedDouble = Double.valueOf(primitiveDouble);
        
        clearLine();
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);

        clearLine();

        // Unboxing: Converting wrapper classes back to their corresponding primitive types
        int unboxedInt = wrappedInt.intValue();
        double unboxedDouble = wrappedDouble.doubleValue();

        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Double: " + unboxedDouble);

        clearLine();

        // Using wrapper class methods
        String intString = "123";
        String doubleString = "456.78";

        int parsedInt = Integer.parseInt(intString);
        double parsedDouble = Double.parseDouble(doubleString);

        System.out.println("Parsed Integer from String: " + parsedInt);
        System.out.println("Parsed Double from String: " + parsedDouble);

        clearLine();
    }

    public static void clearLine() {
        System.out.println(
                "----------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
}
