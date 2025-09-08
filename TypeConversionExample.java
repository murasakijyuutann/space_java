public class TypeConversionExample {
    public static void main(String[] args) {

        // 🔹 1. Automatic Type Conversion (Widening) → Safe
        int smallNumber = 25;
        long bigNumber = smallNumber; // int → long
        float floatNumber = bigNumber; // long → float

        System.out.println("🔹 Automatic Conversion (Widening):");
        System.out.println("int → long → float: " + floatNumber);

        System.out.println("------------------------------------------------------------------");

        // 🔸 2. Manual Type Conversion (Narrowing) → Risky, may lose data
        double pi = 3.14159;
        int approxPi = (int) pi; // double → int

        System.out.println("\n🔸 Manual Conversion (Narrowing):");
        System.out.println("double (" + pi + ") → int: " + approxPi);

        System.out.println("------------------------------------------------------------------");

        // 🔁 3. String to int and back
        String strValue = "123";
        int parsed = Integer.parseInt(strValue); // String → int
        String backToString = String.valueOf(parsed); // int → String

        System.out.println("\n🔁 String to int and back:");
        System.out.println("String \"" + strValue + "\" → int: " + parsed);
        System.out.println("int → String: \"" + backToString + "\"");

        System.out.println("------------------------------------------------------------------");

        // ⚠️ 4. Invalid conversion (with try-catch)
        String wrongValue = "abc";
        try {
            int failed = Integer.parseInt(wrongValue); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("\n⚠️ Invalid conversion:");
            System.out.println("Cannot convert \"" + wrongValue + "\" to int.");
        }

        System.out.println("------------------------------------------------------------------");

        // 🔡 5. char to int
        char letter = 'A';
        int ascii = letter; // char → int (gets ASCII value)

        System.out.println("\n🔡 Char to int:");
        System.out.println("char '" + letter + "' → int: " + ascii); // 65

        System.out.println("------------------------------------------------------------------");
        int number = 255;

        // 6. Decimal to Binary / Hex / Octal
        // 🔹 Decimal to Binary
        String binary = Integer.toBinaryString(number); // e.g., 11111111

        // 🔹 Decimal to Hexadecimal
        String hex = Integer.toHexString(number); // e.g., ff

        // 🔹 Decimal to Octal
        String octal = Integer.toOctalString(number); // e.g., 377

        System.out.println("Decimal: " + number);
        System.out.println("Binary  : " + binary);
        System.out.println("Hex     : " + hex);
        System.out.println("Octal   : " + octal);
    }
}
