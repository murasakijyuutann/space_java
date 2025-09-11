package Starbucks;

public class DessertMenu {
    public enum DessertType {
        CAKE(4.00), PIE(3.50), ICE_CREAM(2.50), COOKIE(1.75);

        private final double price;

        DessertType(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }
}
