package mytime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class MyPeriod {

    public static void main(String[] args) {

        /**
         * Example 1
         *
         * Explanation:
         * Check the toString() method of Period class.
         * ZERO period is displayed as P0D, other than that,
         * Period components (year, month, day) with 0 values are ignored.
         *
         * toString()'s result starts with P, and
         * for non-zero year, Y is appended;
         * for non-zero month, M is appended;
         * for non-zero day, D is appended.
         * P,Y,M and D are in upper case.
         *
         * NOTE: Period.parse(CharSequence) method accepts the String
         * parameter in "PnYnMnD" format, over here P,Y,M and D can be in any case.
         */
        Period period = Period.of(0, 1000, 0);
        System.out.println(period); // P1000M

        /**
         * Example 2
         *
         * Explanation:
         * Period.of(0, 0, 0); is equivalent to Period.ZERO.
         * ZERO period is displayed as P0D, other than that,
         * Period components (year, month, day) with 0 values are ignored.
         *
         * toString()'s result starts with P, and
         * for non-zero year, Y is appended;
         * for non-zero month, M is appended;
         * for non-zero day, D is appended.
         * P,Y,M and D are in upper case.
         *
         * NOTE: Period.parse(CharSequence) method accepts the String parameter
         * in "PnYnMnD" format, over here P,Y,M and D can be in any case.
         */
        Period period2 = Period.of(0, 0, 0);
        System.out.println(period2); // P0D

        /**
         * Example 3
         *
         * Explanation:
         * of and ofXXX methods are static methods and not instance methods.
         *
         * Period.of(2, 1, 0) => returns an instance of Period type.
         *
         * static methods can be invoked using class_name or using reference variable.
         *
         * In this case ofYears(10) is invoked on period instance but compiler uses
         * Period's instance to resolve the type, which is period.
         * A new Period instance {P10Y} is created, after that another Period instance
         * {P5M} is created and finally Period instance {P2D} is created.
         * This instance is assigned to period reference variable and hence P2D is
         * printed on to the console.
         */
        Period period3 = Period.of(2, 1, 0); // P2Y1M
        period3 = period3.ofYears(10); // P10Y
        period3 = period3.ofMonths(5); // P5M
        period3 = period3.ofDays(2); // P2D
        System.out.println(period3); // P2D

        /**
         * Example 4
         *
         * Explanation:
         * There are 2 of methods available in LocalDate class:
         * of(int, int, int) and
         * of(int, Month, int).
         * Month can either be passed as int value (1 to 12) or
         * enum constants Month.JANUARY to Month.DECEMBER.
         *
         * Period.parse(CharSequence) method accepts the String parameter
         * in "PnYnMnD" format, over here P,Y,M and D can be in any case.
         * "p-30000y" means Period of -30000 years.
         *
         * The minimum supported LocalDate is: {-999999999-01-01} and
         * maximum supported LocalDate is: {+999999999-12-31}.
         * If period of -30000 years is added to 1st Jan 2000,
         * then result is 1st Jan -28000.
         */
        LocalDate date4 = LocalDate.of(2000, Month.JANUARY, 1);
        Period period4 = Period.parse("p-30000y");
        System.out.println(date4.plus(period4)); // -28000-01-01
    }
}
