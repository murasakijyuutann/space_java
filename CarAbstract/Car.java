package CarAbstract;

public class Car extends Vehicle implements Insurable {

    public Car(String model, String brand, int year, double mileage) throws InvalidMileageException {
        super(model, brand, year, mileage);
    }

    @Override
    public void showInfo() {
        System.out.println("[Car Info]");
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage + " km");
    }

    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public double getInsuranceValue() {
        return 50000 - (mileage * 0.2);
    }
}
