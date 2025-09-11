package EnumDice;

import java.util.Random;
import java.util.Scanner;

public class RollDice {

    public static int rollDiceOne() {
        return rollDice(Dice.DiceSidesOne.values());
    }

    public static int rollDiceTwo() {
        return rollDice(Dice.DiceSidesTwo.values());
    }

    private static int rollDice(Dice.DiceValueProvider[] diceSides) {
        Random random = new Random();
        int index = random.nextInt(diceSides.length);
        return diceSides[index].getValue(); // ✅ Safe access via interface
    }

    public static void main(String[] args) {
        System.err.println("Dice Rolling Simulator");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press Enter to roll the dice...");
        scanner.nextLine();

        int diceOneResult = rollDiceOne(); // ✅ Now declared properly
        int diceTwoResult = rollDiceTwo();
        int total = diceOneResult + diceTwoResult;

        System.out.println("Dice One: " + diceOneResult);
        System.out.println("Dice Two: " + diceTwoResult);
        System.out.println("Total: " + total);
    }
}
