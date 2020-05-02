package stringbuffer;

public class Capacity {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.ensureCapacity(17);
        System.out.println(sb.capacity()); // 34

        StringBuffer sb2 = new StringBuffer(2);
        sb2.append("ab");
        System.out.println(sb2.capacity()); // 2
        sb2.append("c");
        System.out.println(sb2.capacity()); // 6

        StringBuffer sb3 = new StringBuffer("soft");
        System.out.println(sb3.capacity()); // 20 -> (soft = 4) + 16

        StringBuffer sb4 = new StringBuffer(1000);
        sb4.append("ABC");
        System.out.println(sb4.capacity()); // 1000 - 997 spaces in memory not used
        sb4.trimToSize(); // - trim up to 3 characters
        System.out.println(sb4.capacity()); // 3
    }
}
