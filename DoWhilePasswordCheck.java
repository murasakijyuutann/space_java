import java.util.Scanner;

public class DoWhilePasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "miku2025";
        String input;
        int attempts = 0;

        do {
            System.out.print("Enter password: ");
            input = scanner.nextLine();
            attempts++;

            if (input.isEmpty()) {
                System.out.println("❌ Input cannot be blank. Try again.\n");
                continue;
            }

            if (!input.equals(correctPassword)) {
                System.out.println("❌ Incorrect password. Attempts: " + attempts + "\n");
            }

        } while (!input.equals(correctPassword));

        System.out.println("✅ Access granted in " + attempts + " attempt(s).");
        scanner.close();
    }
}
