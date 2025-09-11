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
        cars.add(new Car("Aston Martin", "Valkyrie", 2021, 250.0, "岸田文雄"));
        cars.add(new Car("McLaren", "Speedtail", 2019, 250.0, "菅義偉"));
        cars.add(new Car("Pagani", "Huayra", 2012, 230.0, "山本一郎"));
        cars.add(new Car("Koenigsegg", "Jesko", 2020, 300.0, "松本潤"));
        cars.add(new Car("Lamborghini", "Aventador", 2011, 217.0, "二階俊博"));
        cars.add(new Car("Ferrari", "LaFerrari", 2013, 217.0, "小泉進次郎"));
        cars.add(new Car("Porsche", "918 Spyder", 2013, 211.0, "安倍晋三"));
        cars.add(new Car("Nissan", "GT-R", 2007, 196.0, "石破茂"));
        cars.add(new Car("Chevrolet", "Corvette C8", 2020, 194.0, "野田佳彦"));
        cars.add(new Car("Ford", "GT", 2016, 216.0, "菅直人"));
        cars.add(new Car("Tesla", "Roadster", 2020, 250.0, "小池百合子"));
        cars.add(new Car("Jaguar", "XJ220", 1992, 213.0, "中村俊輔"));

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
