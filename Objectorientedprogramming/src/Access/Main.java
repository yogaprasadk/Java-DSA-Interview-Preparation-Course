package Access;

import Accesscontrol.A;

public class Main {
    public static void main(String[] args) {
        A a = new A(4, "d");
        // here var variable is accessed as public because when we declare public to a variable or method we can be able to access it anywhere from other packages.
        int num = a.var;

        // default access modifier can't able to access from other package.
        // a.name
    }
}
