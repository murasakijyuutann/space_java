public class Person {
    String name;
    int age;
    Gender gender;

    enum Gender {
        M, F;
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void showInfo() {
        System.out.println("name is: " + name);
        System.out.println("age is: " + age);
        System.out.println("Gender is: " + gender);
    }

    public static void main(String[] args) {
        Person Alice = new Person("Alice", 20, Gender.F);
        Person Bob = new Person("Bob", 30, Gender.M);

        Alice.showInfo();
        System.out.println("-----------------------");
        Bob.showInfo();
    }

}
