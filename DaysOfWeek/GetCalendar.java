package DaysOfWeek;

import java.util.Calendar;

public class GetCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.err.println("Current Date: " + cal.getTime());

        System.out.println("Months and their number of days:\n");

        for (Month.MonthName month : Month.MonthName.values()) {
            System.out.println("Month: " + month + " has " + month.getDays() + " days.");
        }
    }
}
