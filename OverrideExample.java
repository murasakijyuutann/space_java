// Parent class
class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    public void sound() {   // overriding the parent method
        System.out.println("Woof woof!");
    }
}

// Main class to test
public class OverrideExample {
    public static void main(String[] args) {
        // Animal myAnimal = new Animal(); // Parent type
        Animal myDog = new Dog();       // Parent reference, Child object

        // myAnimal.sound(); // Calls Animal's method
        myDog.sound();    // Calls Dog's overridden method
    }
}
