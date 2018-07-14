package DisplayTheNumbersOfDayFromXXXXToYYYY;

import java.util.Scanner;

public class TheNumbersOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the years start: ");
        int start = scanner.nextInt();
        System.out.println("Enter the years end: ");
        int end = scanner.nextInt();

        System.out.printf("The numbers of day from %d to % d is ",start,end);
        int days = theNumberOfDayFromYearToYear(start, end);
        System.out.println(days + " days.");
    }

    public static int theNumberOfDayFromYearToYear(int start, int end) {
        int day = 0;
        for (int i = start; i <= end; i++) {
            day += theNumbersOfDayInAYear(i);
        }
        return day;
    }

    private static int theNumbersOfDayInAYear(int year) {
        if (isLeapYear(year)) return 366;
        else return 365;
    }

    private static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    return true;
                }
            } else return true;
        }
        return isLeapYear;
    }
}
