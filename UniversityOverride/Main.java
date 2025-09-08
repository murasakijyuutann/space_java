package UniversityOverride;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Sana", 19, "Computer Science");
        Teacher t = new Teacher("Dr. Kuro", 52, "Physics");
        Staff st = new Staff("Yumi", 34, "Librarian");

        s.showInfo();
        System.out.println(s);
        System.out.println("------------");

        t.showInfo();
        System.out.println(t);
        System.out.println("------------");

        st.showInfo();
        System.out.println(st);
    }
}
