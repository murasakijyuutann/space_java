package Lambda;

public class LambdaConcatExample {
    public static void main(String[] args) {
        // Lambda expression to concatenate two strings
        StringOperation concat = (a, b) -> a + b;
        StringOperation upperConcat = (a, b) -> (a + b).toUpperCase();
        StringOperation withSpace = (a, b) -> a + " " + b;

        // Test examples
        System.out.println("Concat: " + concat.combine("Hatsune", "Miku"));        // HatsuneMiku
        System.out.println("Uppercase: " + upperConcat.combine("megurine", "luka")); // MEGURINELUKA
        System.out.println("With space: " + withSpace.combine("Kagamine", "Len")); // Kagamine Len
        System.out.println("Uppercase: " + upperConcat.combine("meiko", ""));
    }

    // Functional interface
    interface StringOperation {
        String combine(String a, String b);
    }
}
