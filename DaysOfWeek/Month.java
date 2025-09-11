package DaysOfWeek;

public class Month {
    public enum MonthName {
        JANUARY(31),
        FEBRUARY(28), // leap year can be handled optionally
        MARCH(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31);

        private final int days;

        MonthName(int days) {
            this.days = days;
        }

        public int getDays() {
            return days;
        }
    }
}
