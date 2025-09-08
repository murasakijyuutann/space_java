package Student;

public class Student {
    private String name;
    private int age;
    private String major;
    private Subject[] enrolledSubjects;

    public Student(String name, int age, String major) {
    this.name = name;
    this.age = age;
    this.major = major;
    this.enrolledSubjects = new Subject[5];
}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject[] getEnrolledSubjects() {
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
        for (int i = 0; i < enrolledSubjects.length; i++) {
            if (enrolledSubjects[i] == null) {
                enrolledSubjects[i] = subject;
                return;
            }
        }
        System.out.println("Cannot add more subjects, maximum limit reached.");
    }

    public void displayInfo() {
    System.out.println("Name : " + name);
    System.out.println("Age  : " + age);
    System.out.println("Major: " + major);
    System.out.println("Subjects:");
    
    boolean hasSubjects = false;
    for (Subject subject : enrolledSubjects) {
        if (subject != null) {
            subject.displayInfo();
            hasSubjects = true;
        }
    }
    if (!hasSubjects) {
        System.out.println("  No subjects assigned.");
    }

    System.out.println();
}

}
