public class Main {
    public static void main(String[] args) {
       /*
        * Wrapper classes = Allow primitive values (int, char, double, boolean)
        * to be used as objects. "Wrap them in an object" Generally, don't wrap
        * primitives unless you need an object. Allows use Collections Framework
        * and static Utility Methods.
        */

        /* //Autoboxing
        *Integer a = 123;
        *Double b = 3.14;
        *Character c = '$';
        *Boolean d = true;

        //Unboxing
        int x = a;
        double y = b;
        //!(...)
        */

        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(true);

        String X = a + b + c + d;
        System.out.println(X);
    }
}