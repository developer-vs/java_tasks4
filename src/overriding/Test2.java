package overriding;

public class Test2 {
    class P {
        private void m1() { }
        public final void m2() { }
        public void m3() { }
        public void m4() { }
    }
    abstract class C extends P {
        private void m1() { } // we can't override private method from P

        // public void m2() { }       // CE: we can't override final method from P
        // public final void m2() { } // CE: we can't override final method from P

        @Override
        public final void m3() { } // we can override non-final method from P

        @Override
        public abstract void m4(); // we can override method m4() from P and make it abstract
    }
    class SubC extends C {
        @Override
        public void m4() { }
    }
}
