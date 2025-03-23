package Properties.polymorphism;

public class shapes {
    void area(){
        System.out.println("I am in shapes");
    }


    // when you declare here method as final you cant able to access the methods.
    // you can't able to override
//    final void area(){
//        System.out.println("I am in shapes");
//    }

    // using final you can able to achieve performance enhancement.
    // the compiler knows these methods cant be overridden.
    // The methods will call at runtime.
     // the small function with final the java compiler copy the bytecode directly compile code eliminates the overhead will be resolved.
    // Dynamic methods solution can be performed at runtime because override will be processed at runtime. hence it known as Late binding.
    // final method cannot be overriden one can be resolved at compiletime only hence it known as "early binding".
}
// the final can be used to prevent polymorphism and inheritance.

