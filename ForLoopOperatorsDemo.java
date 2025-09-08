public class ForLoopOperatorsDemo {
    public static void main(String[] args) {

        System.out.println("1. for (int i = 0; i < 5; i++) => for loop with i++");
        for (int i = 0; i < 5; i++) {
            System.out.println("i++ -> i = " + i);
        }

        System.out.println("\n2. for (int i = 0; i < 5; ++i) => for loop with ++i");
        for (int i = 0; i < 5; ++i) {
            System.out.println("++i -> i = " + i);
        }

        System.out.println("\n3.  for (int i = 5; i > 0; i--) => Countdown with i--");
        for (int i = 5; i > 0; i--) {
            System.out.println("i-- -> i = " + i);
        }

        System.out.println("\n4. for (int i = 0; i <= 10; i += 2) => Step by 2 with i += 2");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("i += 2 -> i = " + i);
        }

        System.out.println("\n5. for (int i = 15; i >= 0; i -= 3) => Decrease by 3 with i -= 3");
        for (int i = 15; i >= 0; i -= 3) {
            System.out.println("i -= 3 -> i = " + i);
        }

        System.out.println("\n6. Difference between i++ and ++i inside loop");

        int a = 0;
        int b = 0;

        System.out.println("Using a++");
        for (int i = 0; i < 3; i++) {
            System.out.println("a++ = " + a++);
        }

        System.out.println("Using ++b");
        for (int i = 0; i < 3; i++) {
            System.out.println("++b = " + ++b);
        }
    }
}
