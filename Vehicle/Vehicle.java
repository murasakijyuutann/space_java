package Vehicle;

public class Vehicle {
    private String manufacturer;
    private String model;
    private int year;
    private double mileage;
    private String ownerFullName;

    public Vehicle(String model, String manufacturer, int year, double mileage, String ownerFullName) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.ownerFullName = ownerFullName;
    }


    public void showInfo() {
        System.out.println("Engine Started");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("Owner's Full Name: " + ownerFullName);
    }

    // Type Conversion Method (Override-style)
    public void convertMileage() {
        int mileageAsInt = (int) mileage; // 🔹 double → int
        String mileageStr = String.valueOf(mileage); // 🔹 double → String

        System.out.println("🔁 Converting Mileage:");
        System.out.println("As int   : " + mileageAsInt);
        System.out.println("As String: " + mileageStr);

        // If you want binary/hex/oct of int mileage
        System.out.println("Binary   : " + Integer.toBinaryString(mileageAsInt));
        System.out.println("Hex      : " + Integer.toHexString(mileageAsInt));
        System.out.println("Octal    : " + Integer.toOctalString(mileageAsInt));
    }

    // Getters
    public String getManufacturer() { return manufacturer; }
    public int getYear() { return year; }
    public double getMileage() { return mileage; }
    public String getOwnerFullName() { return ownerFullName; }
    public String getModel() { return model; }

    // Setters
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public void setYear(int year) { this.year = year; }
    public void setMileage(double mileage) { this.mileage = mileage; }
    public void setOwnerFullName(String ownerFullName) { this.ownerFullName = ownerFullName; }
    public void setModel(String model) { this.model = model; }
}
