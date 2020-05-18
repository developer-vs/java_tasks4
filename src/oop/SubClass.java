package oop;

class Dog {}
abstract class Cat {}
final class Electronics {}

/*
    A top level class can be declared with either public
    or default modifiers.

    public classes is accessible across all packages
    but class declared with default modifier and be
    accessed in the defining package only.
*/

// private class Car {}: a top level class cannot be declared with private modifier.
// private class Car {}

// protected class Car {}: a top level class cannot be declared with protected modifier.
// protected class Car {}

// class Dog {}: can be sub-classed within the same package.
// public class SubClass extends Dog {}

// abstract class Cat {}: can be sub-classed within the same package.
// public class SubClass extends Cat {}

// final class Electronics {}: a class with final modifier cannot be sub-classed.
// public class SubClass extends Electronics {}
