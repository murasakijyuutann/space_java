package Vehicle;

public class Car extends Vehicle {
    public enum CarType {
        SEDAN, SUV, COUPE, HATCHBACK, CONVERTIBLE, SUPERCAR, SPORTS
    }

    private CarType carType;

    public Car(String model, String manufacturer, int year, double mileage, CarType carType, String ownerFullName) {
        super(model, manufacturer, year, mileage, ownerFullName);
        this.carType = carType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    // ✅ Implement abstract methods
    @Override
    public void makeSound() {
        System.out.println(getModel() + " goes VROOM VROOM! 🚗");
    }

    @Override
    public void move() {
        System.out.println(getModel() + " is now driving smoothly on the road.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Car Type: " + carType);
    }

    @Override
    public void convertMileage() {
        System.out.println(" Car-specific conversion:");
        super.convertMileage();
    }
}
