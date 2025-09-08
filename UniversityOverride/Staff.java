package UniversityOverride;

public class Staff extends UniversityMember {
    String role;

    public Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Role: " + role);
    }

    @Override
    public String toString() {
        return "Staff{name='" + name + "', age=" + age + ", role='" + role + "'}";
    }
}
