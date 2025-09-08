package UniversityOverride;

public class Teacher extends UniversityMember {
    String department;

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Department: " + department);
    }

    @Override
    public String toString() {
        return "Teacher{name='" + name + "', age=" + age + ", department='" + department + "'}";
    }
}
