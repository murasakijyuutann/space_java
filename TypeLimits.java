public class TypeLimits {
    public static void main(String[] args) {
        System.out.println("=== Java Primitive Type Limits ===");

        // Integer types
        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;

        System.out.println("byte    : " + byteMin + " to " + byteMax);
        System.out.println("short   : " + shortMin + " to " + shortMax);
        System.out.println("int     : " + intMin + " to " + intMax);
        System.out.println("long    : " + longMin + " to " + longMax);

        System.out.println();

        // Floating point types
        float floatMin = -Float.MAX_VALUE;  // Smallest usable NEGATIVE float
        float floatMax = Float.MAX_VALUE;
        double doubleMin = -Double.MAX_VALUE;
        double doubleMax = Double.MAX_VALUE;

        System.out.println("float   : " + floatMin + " to " + floatMax);
        System.out.println("double  : " + doubleMin + " to " + doubleMax);

        System.out.println();

        // Character type (Unicode range)
        char charMin = Character.MIN_VALUE;  // '\u0000'
        char charMax = Character.MAX_VALUE;  // '\uffff'

        System.out.println("char    : " + (int) charMin + " to " + (int) charMax);  // show as numbers

        System.out.println();

        // Boolean type (no min/max, just two values)
        boolean boolFalse = false;
        boolean boolTrue = true;

        System.out.println("boolean : " + boolFalse + " or " + boolTrue);
    }
}
