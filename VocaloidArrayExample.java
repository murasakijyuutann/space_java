import java.util.Random;

public class VocaloidArrayExample {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[20];

        System.out.println("List of int from 1 - 20");
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            int randomInt = random.nextInt(array.length);
            System.out.printf(array[randomInt] + ", ");
        }
        System.out.printf("\n"); drawLine();
        // Declare and initialize an array of Vocaloid names
        String[] vocaloids = {
                "Hatsune Miku",
                "Kagamine Rin",
                "Kagamine Len",
                "Megurine Luka",
                "MEIKO",
                "KAITO"
        };
        // Print each Vocaloid name using a loop
        System.out.println("List of Vocaloids:");
        for (int i = 0; i < vocaloids.length; i++) {
            int randomVocaloid = random.nextInt(vocaloids.length);
            System.out.printf(vocaloids[randomVocaloid] + ", ");
        }
        System.out.printf("\n"); drawLine();

        int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        System.out.println("Array contents:");
        for (int i = 0; i < numbers.length; i++) {
            int randomNum = random.nextInt(numbers.length);
            System.out.printf(numbers[randomNum] + ", ");
        }
    }
    
    public static void drawLine() {
        System.out.println("-----------------------------------------------------------------------------");
    }
}
