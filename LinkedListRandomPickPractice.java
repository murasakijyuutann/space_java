import java.util.*;


public class LinkedListRandomPickPractice {
    public static void main(String[] args) {
        

        // === 1. LinkedList of numbers from 1 to 20 ===
        LinkedList<Integer> intList = new LinkedList<>();
        System.out.println(intList);
        for (int i = 1; i <= 20; i++) {
            intList.add(i);
        }
        System.out.println(intList);
        Collections.shuffle(intList);  // Shuffle the list randomly

        System.out.println("🎲 Shuffled numbers from 1 to 20:");
        for (int num : intList) {
            
            System.out.print(num + ", ");
        }
        System.out.println("\n");
        System.out.println(intList);
        System.out.println(intList.toString());
        System.out.println("\n-------------------------------------------------");

        // === 2. LinkedList of Vocaloid names ===
        LinkedList<String> vocaloids = new LinkedList<>(Arrays.asList(
            "Hatsune Miku",
            "Kagamine Rin",
            "Kagamine Len",
            "Megurine Luka",
            "MEIKO",
            "KAITO"
        ));

        Collections.shuffle(vocaloids);  // Shuffle Vocaloid list

        System.out.println("🎤 Shuffled Vocaloid lineup:");
        for (String name : vocaloids) {
            System.out.print(name + ", ");
        }
        System.out.println("\n-------------------------------------------------");

        // === 3. LinkedList of predefined numbers ===
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(
            10, 20, 30, 40, 50, 60, 70, 80, 90, 100
        ));

        Collections.shuffle(numbers);  // Shuffle predefined number list

        System.out.println("🔢 Shuffled number set (10–100):");
        for (int value : numbers) {
            System.out.print(value + ", ");
        }

        System.out.println("\n-------------------------------------------------");
    }
}
