package Properties.polymorphism;

public class circle extends shapes {

    // this will run when object is created.
    // here override is used here because we need to check a method is overridden or not.
    //Example: Shapes shape = new circle() // this is called overridden (because of same method name).
    @Override // this is called annotation
    void area(){
        System.out.println("sq*sq");
    }
}
