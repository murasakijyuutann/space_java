package CarOverride;

public class Truck extends Vehicle {
    private String model;

    public Truck(String model, String brand, int year, double mileage) {
        super(brand, year, mileage); // Reuse Vehicle's constructor
        this.model = model;
    }

    // 🟡 Getter & Setter for model
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    @Override
    public void showInfo() {
        super.showInfo(); // Vehicle info
        System.out.println("Model: " + model);
    }

    @Override
    public void convertMileage() {
        System.out.println("🚚 Truck-specific conversion:");
        super.convertMileage();

    if (getMileage() > 8000) {
        System.out.println("⚠️  This truck has high mileage!");
        }
    }


}
