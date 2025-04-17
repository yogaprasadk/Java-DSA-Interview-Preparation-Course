package Accesscontrol;

// same package accessing in other class with inheritance example.

public class Subclass extends A{
    public Subclass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        Subclass obj = new Subclass(21,"Yoga Prasad");
        // accessing protected variable from same package.
        int num = obj.naa;
    }
}

// a subclass that extends from another subclass.
// subclass within another subclass protected can be accessed.
    class subsubclass extends Subclass{
    public subsubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subsubclass obj = new subsubclass(21,"Yoga Prasad");
        // accessing protected variable from same package.
        int num = obj.naa;
    }
}

// subclass 2 that can access A
class Subclass2 extends A {
    public Subclass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass2 obj = new Subclass2(21, "Yoga Prasad");
        // accessing protected variable from same package.
        int num = obj.naa;
    }

}

