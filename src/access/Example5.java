package access;

abstract class Player {
    /*
        play() method is declared with protected access modifier,
        so overriding method in Example5 class must be declared
        with protected or public access modifier.
     */
    protected void play() {}

    /*
        run() method is declared with default access modifier,
        so overriding method in Example5 class must be declared
        with default, protected or public modifier.
     */
    abstract void run();
}

public class Example5 extends Player {
    /*
        Currently play() method is declared with default access modifier,
        and hence compilation error.
        Should be protected or public for play() method or remove it.
     */
    // void play() {}

    protected void run() {}
}
