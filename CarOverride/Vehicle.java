package CarOverride;

public class Vehicle {
    private String brand;
    private int year;
    private double mileage;
    

    public Vehicle(String brand, int year, double mileage) {
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    public void showInfo() {
        System.out.println("Engine Started");
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " km");
    }

    // 🔄 Type Conversion Method (Override-style)
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

    // 🔵 Getters
    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public double getMileage() { return mileage; }

    // 🟡 Setters
    public void setBrand(String brand) { this.brand = brand; }
    public void setYear(int year) { this.year = year; }
    public void setMileage(double mileage) { this.mileage = mileage; }
}
