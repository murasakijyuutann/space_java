package Zoo;

public class Orca extends Animal {

    public Orca(String name, int id, String species, int age, boolean isEndangered) {
        super(name, id, species, age, isEndangered, AnimalType.MAMMAL);
    }

    @Override
    public void makeSound() {
        System.out.println("Orca makes a sound: Eee-ee-eee!");
    }

    @Override
    public void move() {
        System.out.println("Orca swims gracefully in the ocean.");
    }
}
