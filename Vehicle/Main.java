package Vehicle;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Vehicle> vehicles = new LinkedList<>();

        // Create Car, Bike, and Truck objects
        Car AMGS500 = new Car("AMGS500", "Mercedes-Benz", 2020, 15000.5, Car.CarType.SEDAN, "佐藤善明");
        Car Carrera911 = new Car("Carrera 911", "Porsche", 1974, 12000.0, Car.CarType.SPORTS, "田中美咲");

        Truck ElCamino = new Truck("ElCamino", "Chevrolet", 1977, 7000.0, Truck.TruckType.PICKUP, "高橋唯人");
        Truck SVGRAPTOR = new Truck("SVGRAPTOR", "Ford", 2018, 9000.0, Truck.TruckType.PICKUP, "鈴木桔梗");
        Bike NINJA = new Bike("Ninja ZX-10R", "Kawasaki", 2021, 5000.0, Bike.BikeType.SPORT, "小倉俊介");

        // Add them to the list
        vehicles.add(AMGS500);
        vehicles.add(Carrera911);
        vehicles.add(ElCamino);
        vehicles.add(SVGRAPTOR);
        vehicles.add(NINJA);

        // Display info and convert mileage for each vehicle
        for (Vehicle v : vehicles) {
            v.showInfo();
            v.convertMileage();
            printSeparator();
        }
        printSeparator();
    }

    public static void printSeparator() {
        System.out.println("--------------------------------------------------");
    }
}