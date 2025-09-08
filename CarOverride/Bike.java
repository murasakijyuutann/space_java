package CarOverride;

public class Bike extends Vehicle {
    private String model;

    public Bike(String model, String brand, int year, double mileage) {
        super(brand, year, mileage); // ✅ Pass values to Vehicle constructor
        this.model = model;
    }

    // Getter
    public String getModel() {
        return model;
    }

    // Setter
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void showInfo() {
        super.showInfo(); // 🔹 Prints brand, year, mileage from Vehicle
        System.out.println("Model: " + model);
    }

    @Override
    public void convertMileage() {
        System.out.println("🚗 Bike-specific conversion:");
        super.convertMileage(); // Use Vehicle's version
    }
}
