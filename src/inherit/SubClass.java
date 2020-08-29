package inherit;

public class SubClass extends SuperClass {
    int i, j, k;

    public SubClass(int m, int n) {
        // super(); will be inserted by default
        // CE: There is no default constructor available in 'inherit.SuperClass'
        i = m;
        j = m;
    } //1

    public SubClass(int m) {
        super(m);
    } //2
}
