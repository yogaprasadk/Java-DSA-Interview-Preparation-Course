package Properties.inheritance;

// it is a children class.
public class boxweight extends Box {
     double weight;
     public boxweight(){
            this.weight = 2;
     }

     //here super class is used to refer any object from the derived class.
     boxweight(boxweight other){
         // box old = other
         super(other); // it actually a box class type
         weight = other.weight;
     }

    // multilevel inheritance example
     boxweight(double side,double weight){
         super(side);
         this.weight = weight;
     }

     // here it actually not get overriding when a method become static.
//     @Override
    static void greeting(){
        System.out.println("I am in boxweight class");
    }

     public boxweight(double a,double b,double c,double d){
         // in children to access constructor from parent class so that we want to declare by using super keyword.
         super(a,b,c); // it is used to call parent class constructor
         /*
         super can't able to access which the variable is declared as private.
          */
         // super class is used to call parent constructor which is above the subclass.
         /*
         two use cases
         1. used to initialize values present in parent class.
         2. use super keyword as like this keyword.
         // for example in parent class I declare double weight, so in this file we can access it as this.w instead of this we can write it as super.w
          System.out.println(this.w); instead of this  we can access like this => System.out.println(super.w)
          */
         this.weight = d;
     }

}
