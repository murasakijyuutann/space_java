package CarOverride;

public class Main {
    public static void main(String[] args) {
        // === 🚗 CARS ===
        Car camry = new Car("Camry", "Toyota", 2022, 900.24);
        Car amg500 = new Car("AMG S500", "Mercedes-AMG", 2022, 500.55);
        Car f40 = new Car("F40", "Ferrari", 1987, 2887.15);
        Car carrera = new Car("911 Carrera", "Porsche", 1974, 6690.15);

        printSectionTitle("🚗 CAR INFO");
        camry.showInfo(); printDivider();
        amg500.showInfo(); printDivider();
        f40.showInfo();    printDivider();
        carrera.showInfo(); printEnd();

        // === 🚚 TRUCKS ===
        Truck elCamino = new Truck("El Camino", "Chevrolet", 1984, 3200.0);
        Truck raptor = new Truck("F-150 Raptor", "Ford", 2021, 4500.5);
        Truck cybertruck = new Truck("Cybertruck", "Tesla", 2024, 1200.25);

        printSectionTitle("🚚 TRUCK INFO");
        elCamino.showInfo(); printDivider();
        raptor.showInfo();   printDivider();
        cybertruck.showInfo(); printEnd();

        // === 🏍️ BIKES ===
        Bike yamaha = new Bike("YZF-R1", "Yamaha", 2021, 2100.5);
        Bike ducati = new Bike("Panigale V4", "Ducati", 2023, 1500.0);
        Bike suzuki = new Bike("Hayabusa", "Suzuki", 2020, 3400.75);
        Bike cb750 = new Bike("CB750", "Honda", 1969, 8500.3);

        printSectionTitle("🏍️ BIKE INFO");
        yamaha.showInfo(); printDivider();
        ducati.showInfo(); printDivider();
        suzuki.showInfo(); printDivider();
        cb750.showInfo();  printEnd();

        // === 🔁 TYPE CONVERSION ===
        printSectionTitle("🔁 TYPE CONVERSION");
        int km = 150;
        double kmAsDouble = (double) km;
        String kmAsString = Integer.toString(km);
        System.out.println("Int to double: " + kmAsDouble);
        System.out.println("Int to String: " + kmAsString);
        printEnd();

        // === 🔧 MILEAGE CONVERSION (OVERRIDDEN) ===
        printSectionTitle("🔧 MILEAGE CONVERSION");

        camry.convertMileage(); printDivider();
        amg500.convertMileage(); printDivider();
        f40.convertMileage(); printDivider();
        carrera.convertMileage(); printDivider();

        elCamino.convertMileage(); printDivider();
        raptor.convertMileage(); printDivider();
        cybertruck.convertMileage(); printDivider();

        yamaha.convertMileage(); printDivider();
        ducati.convertMileage(); printDivider();
        suzuki.convertMileage(); printDivider();
        cb750.convertMileage(); printEnd();
    }

    // 🧩 Utility methods
    private static void printSectionTitle(String title) {
        System.out.println("========== " + title + " ==========");
    }

    private static void printDivider() {
        System.out.println("-------------------------------------");
    }

    private static void printEnd() {
        System.out.println("=====================================\n");
    }
}
