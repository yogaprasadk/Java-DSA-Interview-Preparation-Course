package Properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        circle cir = new circle();
        triangle tri = new triangle();
        square sq = new square();
        shape.area();
        // what objects we declare here it only get printed.
        // For example:
        // Shape cir = new Circle();
        // it will print the circle object.

        // types of methods overriding is called depends on the type the object is.
        /*

        Polymorphism - poly means many && Morphism - the way of representing object in different ways.
        polymorphism is of two types
        -> Compile time polymorphism or static polymorphism

        Compile time polymorphism is achieved by using method overloading.

        Method Overloading is achieved by using when a class has different parameters with same name but different numbers,types,parameters,return type should be different.
        -> Runtime Polymorphism or dynamic polymorphism  -
        Runtime Polymorphism is achieved by using method overriding.
         */
        // overriding basically means type is reference variable as parent class but the object is type of subclass.
        // when a super class type reference variable be a parent class

    }
}
