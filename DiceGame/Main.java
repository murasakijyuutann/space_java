package DiceGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("=== Welcome to the High/Low Dice Game! ===");
        System.out.println("Type 'q' to quit, or press Enter to roll the dice.");

        do {
            System.out.print("\n>> Your move (Enter to roll, q to quit): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Goodbye! Thanks for playing :)");
                break;
            }

            Dice playerDice = new Dice();
            Dice computerDice = new Dice();

            playerDice.roll();
            computerDice.roll();

            System.out.print("[You]      rolled: ");
            playerDice.showFace();

            System.out.print("[Computer] rolled: ");
            computerDice.showFace();

            int playerVal = playerDice.getValue();
            int computerVal = computerDice.getValue();

            if (playerVal > computerVal) {
                System.out.println(">> You win!");
            } else if (playerVal < computerVal) {
                System.out.println(">> Computer wins!");
            } else {
                System.out.println(">> It's a tie!");
            }

        } while (true);

        scanner.close();
    }
}
