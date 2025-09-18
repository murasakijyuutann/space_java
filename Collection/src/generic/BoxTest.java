package Collection.src.generic;

public class BoxTest {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setType("Hello, World!");
        System.out.println("String Box: " + stringBox.getType());

        Box<Integer> integerBox = new Box<>();
        integerBox.setType(123);
        System.out.println("Integer Box: " + integerBox.getType());

        Box<Car> carBox = new Box<>();
        carBox.setType(new Car("Tesla", "Red"));
        System.out.println("Car Box: " + carBox.getType().getModel() + ", " + carBox.getType().getColor());
    }
}
