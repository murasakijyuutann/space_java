package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> vocaloids = new HashSet<>();
        vocaloids.add("Hatsune Miku");
        vocaloids.add("Kagamine Rin");
        vocaloids.add("Kagamine Len");
        vocaloids.add("Megurine Luka");
        vocaloids.add("MEIKO");
        vocaloids.add("KAITO");

        lineSeparator();
        System.out.println(vocaloids);
        lineSeparator();

        showAll(vocaloids); // ✅
        searchElement(vocaloids, "Kagamine Rin"); // ✅
    }

    public static void lineSeparator() {
        System.out.println("-------------------------------------------------------------------");
    }

    public static void searchElement(HashSet<String> set, String element) {
        try {
            if (set.contains(element)) {
                System.out.println(element + " is found in the set.");
            } else {
                System.out.println(element + " is not found in the set.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while searching for the element: " + e.getMessage());
        }
    }

    public static void showAll(HashSet<String> set) {
        Iterator<String> findVocaloid = set.iterator();
        while (findVocaloid.hasNext()) {
            System.out.println(findVocaloid.next());
        }
    }
}
