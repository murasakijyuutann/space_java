package CarOverride;

public class Car extends Vehicle {
    private String model;

    public Car(String model, String brand, int year, double mileage) {
        super(brand, year, mileage); // 🔹 use Vehicle's constructor
        this.model = model;
    }

    // 🔹 Getter & Setter for model only (others in Vehicle)
    public String getModel() { return model; }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void convertMileage() {
        System.out.println("🚗 Car-specific conversion:");
        super.convertMileage(); // Use Vehicle's version
    }

    @Override
    public void showInfo() {
        super.showInfo(); // 🔹 Show brand, year, mileage
        System.out.println("Model: " + model);
    }

}
