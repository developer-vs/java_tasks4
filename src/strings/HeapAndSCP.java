package strings;

public class HeapAndSCP {

    public static void main(String[] args) {
        // Two objects will be created:
        // one on a heap - "Spring"
        // another one on a SCP - "Spring"
        String s1 = new String("Spring");

        // Two objects will be created but not assign:
        // one on a heap - SpringFall"
        // another one on a SCP - "Fall"
        s1.concat("Fall");

        // Two objects will be created:
        // one on a heap - "SpringWinter"
        // another one on a SCP - "Winter"
        String s2 = s1.concat("Winter");

        // Two objects will be created but not assign:
        // one on a heap - SpringWinterSummer"
        // another one on a SCP - "Summer"
        s2.concat("Summer");

        System.out.println(s1); // Spring
        System.out.println(s2); // SpringWinter
    }

}
