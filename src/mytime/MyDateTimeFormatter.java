package mytime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MyDateTimeFormatter {

    public static void main(String[] args) {

        /**
         * DateTimeFormatter is a part of "java.time.format" package,
         * whereas LocalDate, LocalTime, LocalDateTime and Period are
         * defined inside "java.time" package.
         */

        /**
         * Example 1
         *
         * Explanation:
         * date --> {2012-01-11}, period --> {P2M},
         *
         * date.minus(period) --> {2011-11-11}
         * [subtract 2 months period from {2012-01-11},
         * month is changed to 11 and year is changed to 2011].
         *
         * formatter -> {MM-dd-yy}, when date {2011-11-11} is formatted
         * in this format 11-11-11 is printed on to the console.
         */
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period period = Period.ofMonths(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
        System.out.println(formatter.format(date.minus(period))); // 11-11-11

        /**
         * Example 2
         *
         * java.time.temporal.UnsupportedTemporalTypeException:
         * Unsupported field: MinuteOfHour
         *
         * Explanation:
         * M represents month & m represents minute,
         * D represents day of the year & d represents day of the month.
         */
        // LocalDate date3 = LocalDate.of(2012, 1, 11);
        // Period period3 = Period.ofMonths(2);
        // DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("mm-dd-yy");
        // System.out.print(formatter3.format(date3.minus(period3)));

        /**
         * Example 3
         *
         * Explanation:
         * LocalDate object doesn't contain time part but ISO_DATE_TIME
         * looks for time portion and throws exception at runtime.
         *
         * you can check following DateTimeFormatter types:
         *
         * BASIC_ISO_DATE,
         *
         * ISO_DATE,
         * ISO_LOCAL_DATE,
         *
         * ISO_TIME,
         * ISO_LOCAL_TIME,
         * ISO_DATE_TIME,
         * ISO_LOCAL_DATE_TIME.
         */
//        System.out.println(LocalDate.parse("1987-09-01")
//                .format(DateTimeFormatter.ISO_DATE_TIME));

        /**
         * Example 4
         *
         * Explanation:
         * ISO_LOCAL_DATE formatter formats the date without the offset,
         * such as "1947-08-15".
         *
         * ISO_DATE formatter formats the date with offset (if available),
         * such as "1947-08-15" or "1947-08-15+05:30",
         * but remember LocalDate object doesn't contain any offset information.
         *
         * In this case, all the three date instances are meaningfully equal.
         */
        LocalDate date1 = LocalDate.parse("1947-08-15", DateTimeFormatter.ISO_DATE);
        System.out.println("date1: " + date1);
        LocalDate date2 = LocalDate.parse("1947-08-15", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("date2: " + date2);
        LocalDate date3 = LocalDate.of(1947, 8, 15);
        System.out.println("date3: " + date3);
        System.out.println(date1.equals(date2) + " : " + date2.equals(date3));
    }
}
