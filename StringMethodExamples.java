public class StringMethodExamples {
    public static void main(String[] args) {
        String stringExample = "This is a string of vowels and consonants of string for practising string methods perhaps";
        int a = 20;
        int b = 200;

        System.err.println("Sum : " + add(a, b));


        System.out.println(clear() + stringExample + clear());
        // Example 1: Using charAt() to get the character at a specific index
        char charAtIndex5 = stringExample.charAt(5);
        System.out.println("1. Character at index 5: " + charAtIndex5);
        clearLine();
        // Example 2: Using indexOf() to find the index of a substring
        int indexOfVowels = stringExample.indexOf("vowels");
        System.out.println("2. Index of 'vowels': " + indexOfVowels);
        clearLine();
        // Example 3: Using substring() to extract a part of the string
        String substringExample = stringExample.substring(10, 20);
        System.out.println("3. Substring from index 10 to 20: " + substringExample);
        clearLine();
        // Example 4: Using toUpperCase() to convert the string to uppercase
        String upperCaseString = stringExample.toUpperCase();
        System.out.println("4. Uppercase string: " + upperCaseString);
        clearLine();
        // Example 5: Using replace() to replace a substring with another substring
        String replacedString = stringExample.replace("string", "text");
        System.out.println("5. String after replacement: " + replacedString);

        clearLine();
        // Example 6: Using split() to split the string into an array of substrings
        String[] splitString = stringExample.split(" ");
        System.out.println("6. Split string into array:");
        for (String str : splitString) {
            System.out.print(str + " ");
        }
        clearLine();
        // Example 7: Using trim() to remove leading and trailing whitespace
        String stringWithWhitespace = "   This string has leading and trailing spaces.   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("7. Trimmed string: '" + trimmedString + "'");
        clearLine();
        // Example 8: Using length() to get the length of the string

        int lengthOfString = stringExample.length();
        System.out.println("8. Length of the string: " + lengthOfString);
        clearLine();
        // Example 9: Using contains() to check if the string contains a specific substring
        boolean containsVowels = stringExample.contains("vowels");
        System.out.println("9.String contains 'vowels': " + containsVowels);
        clearLine();
        // Example 10: Using startsWith() and endsWith() to check the beginning and end of the string
        boolean startsWithThis = stringExample.startsWith("This");
        boolean endsWithPerhaps = stringExample.endsWith("perhaps");
        System.out.println("10. String starts with 'This': " + startsWithThis);
        System.out.println("10. String ends with 'perhaps': " + endsWithPerhaps);
        clearLine();

    }
    

    public static void clearLine() {
        System.out.println(
                "----------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    public static String clear() {
        return "---------------------------------------";
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
