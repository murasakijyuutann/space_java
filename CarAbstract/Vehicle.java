package CarAbstract;

public abstract class Vehicle {
    String model;
    String brand;
    int year;
    double mileage;

    public Vehicle(String model, String brand, int year, double mileage) throws InvalidMileageException {
        if (mileage < 0) {
            throw new InvalidMileageException("Mileage cannot be negative: " + mileage);
        }
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    public abstract void showInfo();
    public abstract String getType();
}
