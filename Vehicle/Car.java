package Vehicle;

public class Car extends Vehicle {
    public enum CarType {
        SEDAN, SUV, COUPE, HATCHBACK, CONVERTIBLE, SUPERCAR, SPORTS
    }
    public CarType carType;

    public Car(String model, String manufacturer, int year, double mileage, CarType carType, String ownerFullName) {
        super(manufacturer, model, year, mileage, ownerFullName); // 🔹 use Vehicle's constructor
        this.carType = carType;
    }

    // Getter
    public CarType getCarType() {
        return carType;
    }
    // Setter
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void showInfo() {
        super.showInfo(); // 🔹 Prints brand, model, year, mileage from Vehicle
        System.out.println("Car Type: " + carType);
    }

    @Override
    public void convertMileage() {
        System.out.println(" Car-specific conversion:");
        super.convertMileage(); // Use Vehicle's version
    }
}