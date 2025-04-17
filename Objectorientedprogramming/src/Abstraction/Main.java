package Abstraction;

public class Main {
    public static void main(String[] args) {
        // it is a simple abstraction can be done by using runtime polymorphism.
//        Son S = new Son();
//        S.partner();
//
//        Daughter D = new Daughter();
//        D.career();
//
        // now passing age
        Son S = new Son(3);
        S.partner();

        Daughter D = new Daughter(4);
        D.career();

        // you cant able to create object for abstract class
        // Parent parent = new Parent();

        // static method.
        Parent.helo();

        // even if u cant able to create Object for parent class you can reference child class
        Parent parent = new Son(3);
        System.out.println(parent.age);
        parent.displaY();
    }
}
