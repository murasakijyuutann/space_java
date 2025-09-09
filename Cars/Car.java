package Cars;

public class Car {
    private String manufacturer;
    private String model;
    private int year;
    private double maxSpeed;
    private String ownerFullName;

    public Car(String manufacturer, String model, int year, double maxSpeed, String ownerFullName) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.ownerFullName = ownerFullName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
public String toString() {
    return String.format(
        "Car [Manufacturer: %-15s | Model: %-15s | Year: %4d | Max Speed: %6.1f km/h | Owner: %s]",
        manufacturer, model, year, maxSpeed, ownerFullName
    );
}

}
