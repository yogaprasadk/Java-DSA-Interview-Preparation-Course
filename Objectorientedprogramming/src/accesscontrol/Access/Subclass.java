package Access;

import Accesscontrol.A;

// A class doesn't have an idea about it child class.
public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass n = new Subclass(21, "Yoga Prasad");
        // here you can be able to access protected variable
        int num = n.naa;

        // protected access modifier can't be able to access particular class from different package.
        // it can be accessed via subclass only

        // protected access modifier can't be able to access particular class from different package. example:
        A no = new A(23, "ss");
        //no.naa can't be able to access.


        // to check subclass is the instance of class A - use instanceof
        System.out.println(n instanceof A); // true;
        System.out.println(n instanceof Subclass);// true;
    }
}
