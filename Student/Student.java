package Student;

import java.util.LinkedList;

public class Student {
    private String name;
    private int age;
    private String major;
    private LinkedList<Subject> enrolledSubjects;

    public Student(String name, int age, String major) {
    this.name = name;
    this.age = age;
    this.major = major;
    this.enrolledSubjects = new LinkedList<>();
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Subject> getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

   public void addSubject(Subject subject) {
       enrolledSubjects.add(subject);
   }

   public void displayInfo() {
    System.out.println("Name : " + name);
    System.out.println("Age  : " + age);
    System.out.println("Major: " + major);
    System.out.println("Subjects:");

    if (enrolledSubjects.isEmpty()) {
        System.out.println("  No subjects assigned.");
    } else {
        for (Subject subject : enrolledSubjects) {
            subject.displayInfo();
        }
    }
    System.out.println();
}


}
