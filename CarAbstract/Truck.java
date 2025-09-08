package CarAbstract;

public class Truck extends Vehicle implements Insurable {

    public Truck(String model, String brand, int year, double mileage) throws InvalidMileageException {
        super(model, brand, year, mileage);
    }

    @Override
    public void showInfo() {
        System.out.println("[Truck Info]");
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " km");
    }

    @Override
    public String getType() {
        return "Truck";
    }

    @Override
    public double getInsuranceValue() {
        return 80000 - (mileage * 0.15);
    }
}
