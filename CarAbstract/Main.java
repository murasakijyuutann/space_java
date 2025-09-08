package CarAbstract;

public class Main {
    public static void main(String[] args) {
        try {
            Vehicle camry = new Car("Camry", "Toyota", 2022, 900.24);
            Vehicle elCamino = new Truck("El Camino", "Chevrolet", 1980, 12800.0);
            Vehicle brokenTruck = new Truck("BadTruck", "FakeBrand", 1999, -50); //  Exception

            printVehicle(camry);
            printVehicle(elCamino);
            printVehicle(brokenTruck); // won't reach here

        } catch (InvalidMileageException e) {
            System.out.println(" Error creating vehicle: " + e.getMessage());
        }
    }

    public static void printVehicle(Vehicle v) {
        v.showInfo();
        drawLine();
        System.out.println("Type: " + v.getType());

        // Cast to Insurable and get insurance value
        if (v instanceof Insurable) {
            Insurable i = (Insurable) v;
            System.out.printf("Insurance Value: $%.2f%n", i.getInsuranceValue());
        }
        drawLine();
    }

    public static void drawLine() {
        System.out.println("---------------------------");
    }
}
