package stringbuffer;

public class OverridesEquals {

    public static void main(String[] args) {
        String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));

        /**
         * str.equals(sb) => String class overrides equals(Object) method but
         * as "sb" is of StringBuilder type so this returns false.
         *
         * StringBuilder class doesn't override equals(Object) method.
         * So Object version is invoked which uses == operator,
         * hence sb.equals(str) returns false as well.
         *
         * false:false is printed on to the console.
         */
    }
}
