//import java.time.LocalDate;
//
//public class NextDayCalculator {
//    public static String getNextDay(int year, int month, int day) {
//        LocalDate date = LocalDate.of(year, month, day);
//        LocalDate nextDay = date.plusDays(1);
//        return nextDay.toString();
//    }
//}

public class NextDayCalculator {
    public static String getNextDay(int year, int month, int day) {
        int[] daysIsMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        day++;
        if (day > daysIsMonth[month - 1]) {
            day = 1;
            month++;
        }
        if (month > 12) {
            month = 1;
            year++;
        }
        return String.format("%04d-%02d-%02d", year, month, day);
    }
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}