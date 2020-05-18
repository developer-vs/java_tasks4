package access;

interface I01 {
    // method m1() is implicitly public and abstract.
    void m1();
}

/*
public class Example4 extends Object implements I01 {

    // method m1() is implicitly public in I01,
    // hence overriding method should also be public,
    // but it is protected and hence compiler complains.
    @Override
    protected void m1() {

    }
}

*/
