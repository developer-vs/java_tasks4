package arrays;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Test28 {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("2018-07-11"));
        dates.add(LocalDate.parse("1919-02-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

        /*
         * removeIf(Predicate) method was added as a default method in Collection interface
         * in JDK 8 and it removes all the elements of this collection that satisfy the
         * given predicate.
         *
         * Predicate's test method returns true for all the LocalDate objects with year
         * less than 2000.
         * So all the LocalDate objects with year value less than 2000 are removed from the list.
         * Remaining LocalDate objects are printed in their insertion order.
         */
        dates.removeIf(x -> x.getYear() < 2000);

        System.out.println(dates); // [2018-07-11, 2020-04-08]
    }
}
