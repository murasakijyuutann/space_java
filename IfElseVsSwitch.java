public class IfElseVsSwitch {
    public static void main(String[] args) {
        int dayNumber = 2;
        int numberOfHoliday = 1;

        // --- Using if-else ---
        System.out.println("Using if-else:");
        if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("Invalid day number");
        }

        // --- Using switch-case ---
        System.out.println("\nUsing switch-case:");
        switch (numberOfHoliday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}
