package Abstraction;

// The superclass or parent class provide general function not the body.
// The subclass or child class determine the method for superclass.
// These Methods are known as "Abstract Method".

// The parent function is declared as abstract and the class also declared as abstract.
//  Every child class has to override all the methods in parent class.

// we cant able to have final class - final public abstract class Parent

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    // you cant able to create constructor for abstract classes. why? because it doesnot have body.
    // abstract Parent();

    // you cant able to create static abstract methods - why? because static cant be overridden and abstract methods needs to be overridden.

    // but you can declare static methods and normal methods.

    static void helo(){
        System.out.println("Hello Makkle");
    }

    void displaY(){
        System.out.println("This is normal method");
    }

    abstract void career();
    abstract void partner();
}
