package Accesscontrol;

//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"Yoga");

        // few things to do
        // 1.access data members.
        // 2.modify data members.

        // here DEFAULT_CAPACITY in internally is private so, I can't able to access this
//        ArrayList<Integer> n = new ArrayList<>();
//        ArrayList.DEFAULT_CAPACITY;

        // now I'm going to access num variable from Class A
        // here obj object can't able to access variable num
        // because in class A it is declared as private.
        // you can able to access here now using obj because in class A we used getter and setter method.
        // the getter and setter method is used to access private variable
        obj.getNum();

        //if I am going to access var variable here
        int ac = obj.var; // you can access like this

    }
}
