package overriding;

public class Test3 {
    public class P {
        public void m1() { }
        protected void m2() { }
    }
    public class C extends P {
        // protected void m1() { } // CE: we can't reduce access modifiers
        public void m2() { }       // OK: we can increase the scope
    }
}
