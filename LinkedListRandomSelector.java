import java.util.*;

public class LinkedListRandomSelector {

    public static void main(String[] args) {
        Random random = new Random();

        // === 1. LinkedList of numbers from 1 to 20 ===
        LinkedList<Integer> intList = new LinkedList<>();
        for (int i = 1; i <= 20; i++) {
            intList.add(i);
        }

        Collections.shuffle(intList);  // Shuffle the list randomly

        // Pick one random number from the list
        int randomIndex1 = random.nextInt(intList.size());
        int pickedNumber = intList.get(randomIndex1);
        System.out.println("Random number from 1 to 20: " + pickedNumber);

        System.out.println("-------------------------------------------------");

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

        // Pick one random vocaloid
        int randomIndex2 = random.nextInt(vocaloids.size());
        String pickedVocaloid = vocaloids.get(randomIndex2);
        System.out.println("Random Vocaloid: " + pickedVocaloid);

        System.out.println("-------------------------------------------------");

        // === 3. LinkedList of predefined numbers ===
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(
            10, 20, 30, 40, 50, 60, 70, 80, 90, 100
        ));

        Collections.shuffle(numbers);  // Shuffle predefined number list

        // Pick one random number
        int randomIndex3 = random.nextInt(numbers.size());
        int pickedValue = numbers.get(randomIndex3);
        System.out.println("Random number from set (10 - 100): " + pickedValue);

        System.out.println("-------------------------------------------------");
    }
}


