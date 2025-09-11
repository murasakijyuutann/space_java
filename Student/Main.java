package Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = createStudents();
        ArrayList<Subject> subjects = createSubjects();

        assignSubjects(students.get(0), subjects); // Miku
        assignSubjects(students.get(1), subjects); // Luka
        assignSubjects(students.get(4), subjects); // Meiko

        System.out.println("\n========== Student Ages ==========");
        printStudentAges(students);

        System.out.println("\n======= Full Student Information =======");
        printAllStudentInfo(students);
    }

    public static ArrayList<Student> createStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Hatsune Miku", 16, "Vocaloid Studies"));
        students.add(new Student("Megurine Luka", 19, "Linguistics"));
        students.add(new Student("Kagamine Rin", 14, "Music Production"));
        students.add(new Student("Kagamine Len", 14, "Music Production"));
        students.add(new Student("Meiko", 17, "Classical Music"));
        students.add(new Student("Kaito", 18, "Jazz Studies"));
        students.add(new Student("Gumi", 20, "Pop Culture"));
        students.add(new Student("IA", 15, "Digital Arts"));
        students.add(new Student("Yuzuki Yukari", 21, "Literature"));
        students.add(new Student("SeeU", 16, "Korean Language"));
        return students;
    }

    public static ArrayList<Subject> createSubjects() {
        ArrayList<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("Mathematics", "MATH101", "Dr. Tanaka", 3.0, 4.0));
        subjects.add(new Subject("Music Theory", "MUS202", "Prof. Hoshino", 2.0, 3.7));
        subjects.add(new Subject("Art History", "ART303", "Ms. Saito", 2.0, 3.5));
        subjects.add(new Subject("Programming Basics", "CS101", "Mr. Yamamoto", 4.0, 3.8));
        subjects.add(new Subject("World Literature", "LIT201", "Dr. Kobayashi", 3.0, 3.9));
        return subjects;
    }

    public static void assignSubjects(Student student, ArrayList<Subject> subjects) {
        for (Subject subject : subjects) {
            student.addSubject(subject);
        }
    }

    public static void printStudentAges(ArrayList<Student> students) {
        System.out.printf("%-20s | %-4s%n", "Name", "Age");
        System.out.println("---------------------|------");
        for (Student student : students) {
            System.out.printf("%-20s | %2d%n", student.getName(), student.getAge());
        }
    }

    public static void printAllStudentInfo(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("\n----------------------------------------");
            student.displayInfo();
        }
        System.out.println("----------------------------------------");
    }
}
