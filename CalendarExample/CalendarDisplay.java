package CalendarExample;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarDisplay {

    // Print calendar header
    public static void printHeader(int year, int month) {
        System.out.printf("\nCalendar for %d - %02d\n", year, month);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        // Get current date
        Calendar current = Calendar.getInstance();
        System.out.println("Today: " + current.get(Calendar.YEAR) + "-" +
                (current.get(Calendar.MONTH) + 1) + "-" +
                current.get(Calendar.DAY_OF_MONTH));

        Scanner scanner = new Scanner(System.in);

        // Input year and month
        System.out.print("Enter year (e.g., 2025): ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1 - 12): ");
        int month = scanner.nextInt();

        // Set calendar to the first day of the chosen month
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);  // Month is 0-based

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); // 1=Sunday, ..., 7=Saturday
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        printHeader(year, month);

        // Initial spacing before the first day
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        // Print each day
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Newline after Saturday
            if ((firstDayOfWeek + day - 1) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println(); // Final newline
        scanner.close();
    }
}
