package EnumDice;

public class Dice {
    public interface DiceValueProvider {
        int getValue();
    }

    public enum DiceSidesOne implements DiceValueProvider {
        ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);
        private final int value;
        DiceSidesOne(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    public enum DiceSidesTwo implements DiceValueProvider {
        ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);
        private final int value;
        DiceSidesTwo(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
}
