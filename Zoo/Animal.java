package Zoo;

public abstract class Animal {
    private String name;
    private int id;
    private String species;
    private int age;
    private boolean isEndangered;
    private AnimalType type;

    public enum AnimalType {
        MAMMAL, REPTILE, BIRD, AMPHIBIAN, FISH, INSECT, ARACHNID
    }

    // Constructor
    public Animal(String name, int id, String species, int age, boolean isEndangered, AnimalType type) {
        this.name = name;
        this.id = id;
        this.species = species;
        this.age = age;
        this.isEndangered = isEndangered;
        this.type = type;
    }

    // Abstract methods to be implemented by all animals
    public abstract void makeSound();
    public abstract void move();

    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
        System.out.println("Endangered: " + (isEndangered ? "Yes" : "No"));
        System.out.println("Type: " + type);
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public boolean isEndangered() { return isEndangered; }
    public void setEndangered(boolean endangered) { isEndangered = endangered; }

    public AnimalType getType() { return type; }
    public void setType(AnimalType type) { this.type = type; }
}
