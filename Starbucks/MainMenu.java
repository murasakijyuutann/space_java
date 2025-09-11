package Starbucks;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Starbucks Kiosk!");
        System.out.println("1. Food");
        System.out.println("2. Coffee");
        System.out.println("3. Dessert");
        System.out.print("Select a category: ");
        int categoryChoice = scanner.nextInt();

        switch (categoryChoice) {
            case 1 -> {
                System.out.println("Food Menu:");
                for (FoodMenu.FoodType food : FoodMenu.FoodType.values()) {
                    System.out.printf("- %s ($%.2f)%n", food, food.getPrice());
                }

                System.out.print("Select food (e.g., 1 for SANDWICH): ");
                int foodChoice = scanner.nextInt();
                FoodMenu.FoodType[] foodOptions = FoodMenu.FoodType.values();
                if (foodChoice >= 1 && foodChoice <= foodOptions.length) {
                    FoodMenu.FoodType selected = foodOptions[foodChoice - 1];
                    System.out.printf("You selected: %s ($%.2f)%n", selected, selected.getPrice());
                } else {
                    System.out.println("Invalid food choice.");
                }
            }

            case 2 -> {
                System.out.println(" Coffee Menu:");
                int i = 1;
                for (CoffeeMenu.CoffeeType coffee : CoffeeMenu.CoffeeType.values()) {
                    System.out.printf("%d. %s ($%.2f)%n", i++, coffee, coffee.getPrice());
                }

                System.out.print("Select coffee type: ");
                int coffeeChoice = scanner.nextInt();
                CoffeeMenu.CoffeeType[] coffeeOptions = CoffeeMenu.CoffeeType.values();

                if (coffeeChoice >= 1 && coffeeChoice <= coffeeOptions.length) {
                    CoffeeMenu.CoffeeType selectedCoffee = coffeeOptions[coffeeChoice - 1];
                    System.out.printf("You selected: %s%n", selectedCoffee);

                    System.out.println("Select Size:");
                    int j = 1;
                    for (CoffeeMenu.Size size : CoffeeMenu.Size.values()) {
                        System.out.printf("%d. %s (Add $%.2f)%n", j++, size, size.getAdditionalCost());
                    }

                    System.out.print("Choose size: ");
                    int sizeChoice = scanner.nextInt();
                    CoffeeMenu.Size[] sizes = CoffeeMenu.Size.values();

                    if (sizeChoice >= 1 && sizeChoice <= sizes.length) {
                        CoffeeMenu.Size selectedSize = sizes[sizeChoice - 1];
                        double totalPrice = selectedCoffee.getPrice() + selectedSize.getAdditionalCost();
                        System.out.printf("You selected: %s %s → Total: $%.2f%n",
                                selectedSize, selectedCoffee, totalPrice);
                    } else {
                        System.out.println("Invalid size choice.");
                    }
                } else {
                    System.out.println("Invalid coffee choice.");
                }
            }

            case 3 -> {
                System.out.println("Dessert Menu:");
                int k = 1;
                for (DessertMenu.DessertType dessert : DessertMenu.DessertType.values()) {
                    System.out.printf("%d. %s ($%.2f)%n", k++, dessert, dessert.getPrice());
                }

                System.out.print("Select dessert: ");
                int dessertChoice = scanner.nextInt();
                DessertMenu.DessertType[] dessertOptions = DessertMenu.DessertType.values();

                if (dessertChoice >= 1 && dessertChoice <= dessertOptions.length) {
                    DessertMenu.DessertType selected = dessertOptions[dessertChoice - 1];
                    System.out.printf("You selected: %s ($%.2f)%n", selected, selected.getPrice());
                } else {
                    System.out.println("Invalid dessert choice.");
                }
            }

            default -> System.out.println("Invalid category choice.");
        }

        scanner.close();
    }
}
