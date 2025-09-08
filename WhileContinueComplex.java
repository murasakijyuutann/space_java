public class WhileContinueComplex {
    public static void main(String[] args) {
        int i = 0;

        while (i < 20) {
            i++; // step first

            if (i % 2 == 0) {
                continue; // skip even numbers
            }

            if (i % 3 == 0) {
                continue; // skip multiples of 3
            }

            System.out.println("Valid number: " + i);
        }
    }
}
