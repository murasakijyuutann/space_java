package CarGetterSetter;

public class Car extends Vehicle {
    private String model;
    private String brand;
    private int year;
    private double mileage;

    public Car(String model, String brand, int year, double mileage) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    // 🟡 Getter methods
    public String getModel() { return model; }
    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public double getMileage() { return mileage; }

    // 🔵 Setter methods
    public void setModel(String model) { this.model = model; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setYear(int year) { this.year = year; }
    public void setMileage(double mileage) { this.mileage = mileage; }

    @Override
    public void showInfo() {
        super.showInfo(); // Vehicle's version
        System.out.println(model + "'s brand is: " + brand);
        System.out.println("This car was released in: " + year);
        System.out.println("Mileage of this car is : " + mileage + " kilometers");
    }

    public static void main(String[] args) {
        Car camry = new Car("Camry", "Toyota", 2022, 900.24);
        Car amg500 = new Car("AMG S500", "Mercedes-AMG", 2022, 500.55);
        Car f40 = new Car("F40", "Ferrari", 1987, 2887.15);
        Car carrera = new Car("911 Carrera", "Porsche", 1974, 6690.15);

        camry.showInfo();
        System.out.println("🔹 Getter example: " + camry.getModel() + " from " + camry.getBrand());
        System.out.println("----------------------------");

        amg500.showInfo();
        System.out.println("----------------------------");

        f40.showInfo();
        System.out.println("----------------------------");

        carrera.showInfo();
        System.out.println("----------------------------");

        // 🧪 Try setter
        carrera.setMileage(9999.99);
        System.out.println("After update: Carrera mileage = " + carrera.getMileage());
    }
}
