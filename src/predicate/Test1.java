package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
        String[] names = {"Tom", "Dan", null, "Alan", "", "Mike"};
        System.out.println("Original strings: " + Arrays.toString(names));
        ArrayList<String> arrayList = new ArrayList<>();
        Predicate<String> p = s -> s != null && s.length() !=  0;
        for(String s : names) {
            if(p.test(s)) {
                arrayList.add(s);
            }
        }
        System.out.println("The list of valid strings: " + arrayList);
    }
}
