package strings;

public final class CustomImmutableClass {

    private final int i;

    CustomImmutableClass(int i) {
        this.i = i;
    }

    public CustomImmutableClass modify(int i) {
        if (i == this.i) {
            return this;
        }
        return new CustomImmutableClass(i);
    }

    public static void main(String[] args) {
        CustomImmutableClass ic1 = new CustomImmutableClass(10);
        CustomImmutableClass ic2 = ic1.modify(100);
        CustomImmutableClass ic3 = ic1.modify(10);
        System.out.println(ic1 == ic2); // false
        System.out.println(ic1 == ic3); // true
    }
}
