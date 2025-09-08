package UniversityOverride;

public class UniversityMember {
    String name;
    int age;

    public UniversityMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Override
    public String toString() {
        return "UniversityMember{name='" + name + "', age=" + age + "}";
    }
}
