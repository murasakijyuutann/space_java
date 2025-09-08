package Student;

public class Subject {
    private String name;
    private String code;
    private String instructor;
    private double credits;
    private double grade;

    public Subject(String name, String code, String instructor, double credits, double grade) {
        this.name = name;
        this.code = code;
        this.instructor = instructor;
        this.credits = credits;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getInstructor() {
        return instructor;
    }

    public double getCredits() {
        return credits;
    }

    public double getGrade() {
        return grade;
    }
    public void displayInfo() {
        System.out.println("Subject Name: " + name);
        System.out.println(", Code: " + code);
        System.out.println(", Instructor: " + instructor);
        System.out.println(", Credits: " + credits);
        System.out.println(", Grade: " + grade);
    }
}
