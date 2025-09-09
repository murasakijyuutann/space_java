package Cars;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();
        cars.add(new Car("Lamborghini", "Miura", 1966, 200.0, "高橋文雄"));
        cars.add(new Car("Ferrari", "Superfast", 2020, 211.0, "田中唯人"));
        cars.add(new Car("Ferrari", "F40", 1990, 201.0, "佐藤健"));
        cars.add(new Car("Porsche", "911", 1974, 180.0, "山田太郎"));
        cars.add(new Car("Mitsubishi", "Lancer Evolution", 1992, 180.0, "鈴木一郎"));
        cars.add(new Car("Daytona", "Dodge", 1969, 150.0, "伊藤誠"));
        cars.add(new Car("Bugatti", "Chiron", 2016, 261.0, "渡辺直美"));
        cars.add(new Car("Konigsegg", "One:1", 2016, 273.0, "木村拓哉"));
        cars.add(new Car("Mercedes-AMG", "Project One", 2020, 217.0, "高市早苗"));

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
