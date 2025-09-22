import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class RegularExpressionTest {

    public static void main(String[] args) {
        String inputText = "Sample text with some numbers: 123-456-7890";
        String phoneNumberRegex = "\\d{3}-\\d{3}-\\d{4}";
        String inputName = "Elizabeth Bennet Collin Fitzwilliam Darcy Michael John Kane Sarah Jessica Parker John Johnathan Ezra Smith Kristine Anne Marie Johnson Margaret Rose Brown";
        String personNameRegex = "[A-Z][a-z]+ [A-Z][a-z]+";

        lineSeparator();
        System.out.println("Checking if input text contains a phone number...");
        boolean containsPhoneNumber = inputText.matches(".*" + phoneNumberRegex + ".*");

        System.out.println("Match result: " + containsPhoneNumber);
        if (containsPhoneNumber) {
            System.out.println("=> Found a valid phone number.");
        } else {
            System.out.println("=> No valid phone number found.");
        }

        lineSeparator();
        searchAndPrintMatches(inputText, phoneNumberRegex);
        lineSeparator();
        extractOnlyDigits();
        lineSeparator();
        replaceWordExample();
        lineSeparator();

        String[] testSamples = {
                "123-456-7890",
                "987-654-3210",
                "123-45-6789",
                "phone: 123-456-7890"
        };
        testRegexOnMultipleSamples(phoneNumberRegex, testSamples);
        lineSeparator();

        String testText = "Call me at 123-456-7890";
        lineSeparator();
        testSingleTextAgainstRegex(testText, phoneNumberRegex);
        lineSeparator();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter your name: ");
        String userInput = scanner.nextLine();
        searchAndPrintMatches(userInput, personNameRegex);
        if(!userInput.matches(".*" + personNameRegex + ".*")) {
            System.out.println(userInput + " is not a valid name. Please try again.");
            System.out.println("Bye");
        } else {
            System.out.println(userInput + " was found in valid names!");
            System.out.println("Bye");
        }
        lineSeparator();

    } // end of main

    
    // Method to search and print all matches of a regex pattern in the input text
    public static void searchAndPrintMatches(String inputText, String regexPattern) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()) {
            System.out.println("Found match: " + matcher.group());
        }
    }

    public static void extractOnlyDigits() {
        String text = "This is a test string with some digits 12345 and letters.";
        String nonDigitRegex = "[^0-9]+"; // Match anything except digits
        String onlyDigits = text.replaceAll(nonDigitRegex, "");
        System.out.println("Extracted digits only: " + onlyDigits);
    }

    public static void replaceWordExample() {
        String originalText = "The quick brown fox jumps over the lazy dog.";
        String targetWord = "fox";
        String replacementWord = "cat";
        String result = originalText.replaceAll(targetWord, replacementWord);
        System.out.println("After replacing 'fox' with 'cat': " + result);
    }

    public static void testSingleTextAgainstRegex(String text, String regex) {
        boolean matches = text.matches(".*" + regex + ".*");
        System.out.println("Text       : " + text);
        System.out.println("Regex      : " + regex);
        System.out.println("Matches?   : " + matches);
    }

    public static void testRegexOnMultipleSamples(String regex, String[] samples) {
        for (String sample : samples) {
            testSingleTextAgainstRegex(sample, regex);
        }
    }

    public static void lineSeparator() {
        System.out.println("------------------------------");
    }
}
