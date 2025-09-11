package Vehicle;

public class Truck extends Vehicle {
    public enum TruckType { PICKUP, LORRY, SEMI }
    public TruckType truckType;

    public Truck(String model, String manufacturer, int year, double mileage, TruckType truckType, String ownerFullName) {
        super(manufacturer, model, year, mileage, ownerFullName); // Reuse Vehicle's constructor
        this.truckType = truckType;
    }

    // 🟡 Getter & Setter for Truck Type
    public TruckType getTruckType() { return truckType; }
    public void setTruckType(TruckType truckType) { this.truckType = truckType; }

    @Override
    public void showInfo() {
        super.showInfo(); // Vehicle info
        System.out.println("Truck Type: " + truckType);
    }

    @Override
    public void convertMileage() {
        System.out.println("Truck-specific conversion:");
        super.convertMileage();

        if (getMileage() > 8000) {
            System.out.println(" This truck has high mileage!");
        }
    }
    
}
