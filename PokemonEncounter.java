import java.util.Scanner;
import java.util.Random;

public class PokemonEncounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("⚡ A wild Pikachu appeared!");
        boolean running = true;

        while (running) {
            System.out.println("\nWhat will you do?");
            System.out.println("1. Fight");
            System.out.println("2. Throw Pokéball");
            System.out.println("3. Run");

            System.out.print("Enter choice (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You attacked Pikachu!");
                    System.out.println("Pikachu used Thunderbolt! ⚡ It's super effective!");
                    break;

                case 2:
                    System.out.println("You threw a Pokéball... 🎯");
                    int chance = rand.nextInt(100); // 0 - 99
                    if (chance < 40) { // 40% chance to catch
                        System.out.println("✨ You caught Pikachu! 🎉");
                        running = false;
                    } else {
                        System.out.println("Oh no! Pikachu broke free!");
                    }
                    break;

                case 3:
                    System.out.println("You ran away safely!");
                    running = false;
                    break;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }

        System.out.println("\nThanks for playing!");
        scanner.close();
    }
}
