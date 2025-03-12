 package staticexample;

// this file to used to show the demo of initialization of  static variable.
public class staticblock {
    static int a = 3;
    static int b;
    // we want that need to initialize static variable  inside the block. it can be done by using static block.
    // static block.
    static { // the static method will run once when its object is created. i.e. when the class is loaded for first time.
        b = a * 4;
    }

    public static void main(String[] args) {

        staticblock obj = new staticblock();
        System.out.println(staticblock.a + " " +staticblock.b);

        staticblock.b = b + 3;
        staticblock obj2 = new staticblock();
        System.out.println(staticblock.b);
    }
}
