package Starbucks;

public class FoodMenu {
    public enum FoodType {
        SANDWICH(5.00), SALAD(4.50), WRAP(4.75), SOUP(3.50);

        private final double price;

        FoodType(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }
}
