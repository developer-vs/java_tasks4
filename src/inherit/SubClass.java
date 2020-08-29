package inherit;

public class SubClass extends SuperClass {
    int i, j, k;

    public SubClass(int m, int n) {
        // super(); will be inserted by default
        // CE: There is no default constructor available in 'inherit.SuperClass'
        i = m;
        j = m;
    }

    public SubClass(int m) {
        super(m);
    }
}
