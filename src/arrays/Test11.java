package arrays;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        List<String> trafficLight = new ArrayList<>();
        /**
         * There is no element at index 0 so call to add element at index 1,
         * "trafficLight.add(1, "RED");" throws an instance of
         * java.lang.IndexOutOfBoundsException.
         */
        trafficLight.add(1, "RED"); // RE,
        trafficLight.add(2, "ORANGE");
        trafficLight.add(3, "GREEN");

        trafficLight.remove(new Integer(2));

        System.out.println(trafficLight);
    }
}
