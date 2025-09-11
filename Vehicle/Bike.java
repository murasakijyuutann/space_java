package Vehicle;

public class Bike extends Vehicle {
    public enum BikeType {
        SPORT, CRUISER, TOURING, STANDARD, DUAL_SPORT
    }

    public BikeType bikeType;

    public Bike(String manufacturer, String model, int year, double mileage, BikeType bikeType,String ownerFullName) {
        super(manufacturer, model, year, mileage, ownerFullName); // ✅ Pass values to Vehicle constructor
        this.bikeType = bikeType;
    }

    // Getter
    public BikeType getBikeType() {
        return bikeType;
    }

    // Setter
    public void setBikeType(BikeType bikeType) {
        this.bikeType = bikeType;
    }

    @Override
    public void showInfo() {
        super.showInfo(); // 🔹 Prints brand, year, mileage from Vehicle
        System.out.println("Bike Type: " + bikeType);
    }

    @Override
    public void convertMileage() {
        System.out.println("Bike-specific conversion:");
        super.convertMileage(); // Use Vehicle's version
    }
}
