package lambdas.example1;

@FunctionalInterface
public interface Square {

    // @FunctionalInterface - not allow us to create two abstract methods

    // SAM (Single Abstract Method)
    int squareIt(int n);
}
