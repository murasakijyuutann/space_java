package Starbucks;

public class CoffeeMenu {
    public enum CoffeeType {
        ESPRESSO(3.00), LATTE(4.00), CAPPUCCINO(4.50), AMERICANO(2.50), MOCHA(4.75);

        private final double price;

        CoffeeType(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }
    
    public enum Size {
        SMALL(0), MEDIUM(0.50), LARGE(1.00);

        private final double additionalCost;

        Size(double additionalCost) {
            this.additionalCost = additionalCost;
        }

        public double getAdditionalCost() {
            return additionalCost;
        }
    }
}
