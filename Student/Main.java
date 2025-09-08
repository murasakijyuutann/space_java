package Student;

public class Main {
    public static void main(String[] args) {
        Student[] students = createStudents();
        Subject[] subjects = createSubjects();

        assignSubjectsToMiku(students[0], subjects); // Miku is at index 0
        assignSubjectsToLuka(students[1], subjects); // Luka is at index 1

        printStudentAges(students);
        System.out.println();
        printAllStudentInfo(students);
    }

    public static Student[] createStudents() {
        return new Student[] {
            new Student("Hatsune Miku", 16, "Vocaloid Studies"),
            new Student("Megurine Luka", 19, "Linguistics"),
            new Student("Kagamine Rin", 14, "Music Production"),
            new Student("Kagamine Len", 14, "Music Production"),
            new Student("Meiko", 17, "Classical Music"),
            new Student("Kaito", 18, "Jazz Studies"),
            new Student("Gumi", 20, "Pop Culture")
        };
    }

    public static Subject[] createSubjects() {
        return new Subject[] {
            new Subject("Mathematics", "MATH101", "Dr. Tanaka", 3.0, 4.0),
            new Subject("Music Theory", "MUS202", "Prof. Hoshino", 2.0, 3.7),
            new Subject("Art History", "ART303", "Ms. Saito", 2.0, 3.5),
            new Subject("Programming Basics", "CS101", "Mr. Yamamoto", 4.0, 3.8),
            new Subject("World Literature", "LIT201", "Dr. Kobayashi", 3.0, 3.9)
        };
    }

    public static void assignSubjectsToMiku(Student miku, Subject[] subjects) {
        for (Subject subject : subjects) {
            miku.addSubject(subject);
        }
    }

    public static void assignSubjectsToLuka(Student luka, Subject[] subjects) {
        for (Subject subject : subjects) {
            luka.addSubject(subject);
        }
    }

    public static void printStudentAges(Student[] students) {
        System.out.println("Student Ages (name + age)");
        System.out.println("----------------------------------");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAge() + " years old");
        }
    }

    public static void printAllStudentInfo(Student[] students) {
        System.out.println("Full Student Information");
        System.out.println("-------<Student Information>---------------------------");
        for (Student student : students) {
            student.displayInfo();
        }
        System.out.println("------------------------------------------------------");
    }
}
