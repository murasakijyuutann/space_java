package DiceGame;

public class Dice {
    private DiceValue face;

    public Dice() {
        this.face = DiceValue.roll();
    }

    public DiceValue getFace() {
        return face;
    }

    public void roll() {
        this.face = DiceValue.roll();
    }

    public int getValue() {
        return face.getValue();
    }

    public void showFace() {
        // Print face of dice with ASCII-safe output
        System.out.println("[Dice] shows: " + face + " (" + getValue() + ")");
    }
}
