package mytime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class MyLocalDate {

    public static void main(String[] args) {

        /**
         * new LocalDate(), new LocalTime() and new LocalDateTime() give
         * compilation error as constructor of these classes are declared private.
         *
         * System.out.println(LocalDate.now()); => Prints current date only.
         *
         * System.out.println(LocalTime.now()); => Prints current time only.
         *
         * System.out.println(LocalDateTime.now()); => Prints current date and time both
         */

        /**
         * Example 1
         *
         * runtime exception: java.time.format.DateTimeParseException:
         * Text '2018-6-28' could not be parsed at index 5
         * LocalDate ld = LocalDate.parse("2018-6-28");
         *
         * Explanation:
         * LocalDate.parse(CharSequence) method accepts String in
         * "9999-99-99" format only.
         * Single digit month and day value are padded with 0 to
         * convert it to 2 digits.
         */

        LocalDate ld = LocalDate.parse("2018-06-28");
        System.out.println(ld); // 2018-06-28

        /**
         * Example 2
         *
         * runtime exception:
         * java.time.DateTimeException: Invalid date 'SEPTEMBER 31'
         *
         * Explanation:
         * LocalDate.of(...) method first validates year,
         * then month and finally day of the month.
         *
         * September can't have 31 days so LocalDate.of(...) method
         * throws an instance of java.time.DateTimeException class.
         */
        // LocalDate ld2 = LocalDate.of(2020, 9, 31);
        // System.out.println(ld2);

        /**
         * Example 3
         *
         * Explanation:
         * In LocalDate.of(int, int, int) method, 1st parameter is year,
         * 2nd is month and 3rd is day of the month.
         *
         * toString() method of LocalDate class prints the LocalDate object
         * in ISO-8601 format: "uuuu-MM-dd".
         */
        LocalDate ld3 = LocalDate.of(2020, 9, 30);
        System.out.println(ld3); // 2020-09-30

        /**
         * Example 4
         *
         * Explanation:
         * date.getMonth() returns the month of the year filed, using Month enum,
         * all the enum constant names are in upper case.
         *
         * date.getMonthValue() returns the value of the month.
         *
         * NOTE: month value starts with 1 and it is different from java.util.Date API, where month value starts with 0.
         */
        LocalDate ld4 = LocalDate.of(2068, 4, 15);
        System.out.println(ld4.getMonth() + ":" + ld4.getMonthValue()); // APRIL:4

        /**
         * Example 5
         *
         * Explanation:
         * date --> {2018-06-06},
         *
         * date.minusDays(10); => as LocalDate is immutable,
         * hence a new LocalDate object is created {2018-05-27}
         * but no variable refers to it. date still refers to {2018-06-06}.
         *
         * 2018-06-06 is displayed on to the console.
         */
        LocalDate ld5 = LocalDate.parse("2018-06-06");
        ld5.minusDays(10);
        System.out.println(ld5); // 2018-06-06

        /**
         * Example 6
         *
         * Explanation:
         * Both the methods "public boolean isEqual(ChronoLocalDate)"
         * and "public boolean equals(Object)" return true if date objects
         * are equal otherwise false.
         *
         * NOTE: LocalDate implements ChronoLocalDate.
         */
        LocalDate ld6 = LocalDate.parse("1980-03-16");
        LocalDate ld62 = LocalDate.parse("1980-03-16");
        System.out.println(ld6.equals(ld62) + " : " + ld6.isEqual(ld62)); // true : true

        /**
         * Example 7
         *
         * Explanation:
         * minusYears, minusMonths, minusWeeks, minusDays methods accept
         * long parameter so you can pass either positive or negative value.
         *
         * If positive value is passed, then that specified value is subtracted
         * and if negative value is passed, then that specified value is added.
         */
        LocalDate ld7 = LocalDate.parse("1980-03-16");
        System.out.println(ld7.minusYears(-5)); // 1985-03-16

        /**
         * Example 8
         *
         * Explanation:
         * joiningDate --> {2006-03-16}.
         *
         * joiningDate.withDayOfYear(29) returns a new LocalDate object
         * with the day of the Year altered.
         *
         * A year has 365 days, so 29 means 29th day of the year,
         * which is 29th Jan 2006.
         *
         * NOTE: There are other with methods, we should know.
         * withDayOfMonth(int), withMonth(int) and withYear(int).
         */
        LocalDate joiningDate = LocalDate.parse("2006-03-16");
        System.out.println(joiningDate.withDayOfYear(29)); // 2006-01-29
        System.out.println(joiningDate.withDayOfYear(35)); // 2006-02-04
        System.out.println(joiningDate.withDayOfMonth(2)); // 2006-03-02
        System.out.println(joiningDate.withDayOfMonth(31)); // 2006-03-31
        System.out.println(joiningDate.withMonth(1)); // 2006-01-16
        System.out.println(joiningDate.withMonth(12)); // 2006-12-16
        System.out.println(joiningDate.withYear(13)); // 0013-03-16
        System.out.println(joiningDate.withYear(00)); // 0000-03-16
        System.out.println(joiningDate.withYear(-1)); // -0001-03-16
        System.out.println(joiningDate.withYear(9999)); // 9999-03-16
        System.out.println(joiningDate.withYear(4 + 8)); // 0012-03-16

        // java.time.DateTimeException:
        // Invalid value for DayOfYear (valid values 1 - 365/366): 400
        // System.out.println(joiningDate.withDayOfYear(400));

        // java.time.DateTimeException:
        // Invalid value for DayOfMonth (valid values 1 - 28/31): 32
        // System.out.println(joiningDate.withDayOfMonth(32));

        // java.time.DateTimeException:
        // Invalid value for MonthOfYear (valid values 1 - 12): 13
        // System.out.println(joiningDate.withMonth(13));

        /**
         * Example 9
         *
         * Explanation:
         * Constructor of LocalDate is declared private so cannot be called from outside,
         * hence new LocalDate(2020, 2, 14); causes compilation failure.
         *
         * Overloaded static methods "of" and "parse" are provided
         * to create the instance of LocalDate.
         *
         * LocalTime, LocalDateTime, Period also specify private constructors
         * and provide "of" and "parse" methods to create respective instances.
         */
        // LocalDate obj = new LocalDate(2020, 2, 14);
        // System.out.println(obj.minus(Period.ofDays(10)));

        /**
         * Example 10
         *
         * Explanation:
         * date --> {2000-06-25}. date.getDayOfMonth() = 25, 25 >= 20 is true,
         * hence control goes inside while loop and executes System.out.println(date);
         * statement.
         *
         * date.plusDays(-1); creates a new LocalDate object {2000-06-24}
         * but date reference variable still refers to {2000-06-25}.
         * date.getDayOfMonth() again returns 25, this is an infinite loop.
         */

        /**
         * you need to note this:
         * a minus and a plus results in a minus sign.
         * a plus and a plus results in a plus sign.
         * a minus and a minus ends up as a plus.
         */
//        LocalDate date10 = LocalDate.parse("2000-06-25");
//        while(date10.getDayOfMonth() >= 20) {
//            System.out.println(date10);
//            date10.plusDays(-1);
//        }
        LocalDate date10 = LocalDate.parse("2000-06-25");
        // System.out.println(date10.plusDays(1)); // 2000-06-26
        // System.out.println(date10.minusDays(-1)); // 2000-06-26

        // System.out.println(date10.minusDays(1)); // 2000-06-24
        // System.out.println(date10.plusDays(-1)); // 2000-06-24

        /**
         * Example 11
         *
         * Explanation:
         * LocalDate.now(); retrieves the current date from the system clock.
         * There is no issue with this statement.
         *
         * obj is of LocalDate type and getHour() method is not defined in
         * LocalDate class, it is defined in LocalTime and LocalDateTime class.
         * Hence obj.getHour() causes compilation failure.
         */
        // LocalDate obj = LocalDate.now();
        // System.out.println(obj.getHour());

        /**
         * Example 12
         *
         * Explanation:
         * "parse" and "of" methods create new instances,
         * so in this case you get 4 different instances
         * of LocalDate stored at 4 different memory addresses.
         */
        LocalDate d1 = LocalDate.parse("1999-09-09");
        LocalDate d2 = LocalDate.parse("1999-09-09");
        LocalDate d3 = LocalDate.of(1999, 9, 9);
        LocalDate d4 = LocalDate.of(1999, 9, 9);
        System.out.println((d1 == d2) + ":" + (d2 == d3) + ":" + (d3 == d4));
        // false:false:false

        /**
         * Example 13
         *
         * Explanation:
         * LocalTime.MIN --> {00:00}
         * LocalTime.MAX --> {23:59:59.999999999}
         * LocalTime.MIDNIGHT --> {00:00}
         * LocalTime.NOON --> {12:00}
         *
         * date.atTime(LocalTime) method creates a LocalDateTime instance
         * by combining date and time parts.
         *
         * toString() method of LocalDateTime class prints the date and
         * time parts separated by T in upper case.
         */
        LocalDate date13 = LocalDate.parse("1947-08-14");
        LocalTime time13 = LocalTime.MAX;
        System.out.println(date13.atTime(time13)); // 1947-08-14T23:59:59.999999999

        /**
         * Example 14
         *
         * Explanation:
         * The minimum supported LocalDate is: {-999_999_999-01-01} and
         * maximum supported LocalDate is: {+999_999_999-12-31}.
         *
         * If period of -3000 years is added to 1st Jan 2000,
         * then result is 1st Jan -1000.
         */
        LocalDate date14 = LocalDate.parse("2000-01-01");
        Period period14 = Period.ofYears(-3000);
        System.out.println(date14.plus(period14)); // -1000-01-01
    }
}
