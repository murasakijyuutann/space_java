package UniversityOverride;

public class Student extends UniversityMember {
    String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Major: " + major);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", major='" + major + "'}";
    }
}
