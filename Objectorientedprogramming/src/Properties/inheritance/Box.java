package Properties.inheritance;

// final can be used to prevent inheritance
//public final class Box // if u declare here final then inside the methods  can be also becomes final.
public class Box {
   /*
        inheritance is defined as the characteristics can be inherited from one class to another class.
        The parent class is called base class.
        The child class which inherit characteristics or properties from the parent class.
        using extends keyword only we can able to access characteristics from base class to child class.
    */

    // if you declare private then it can be able to access it only inside this file only.
    private double l;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // cube
    Box (double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    static void greeting(){
        System.out.println("I am box class");
    }

    //three arguments
    public Box(double len,double hei,double wei){
        this.l = len;
        this.h = hei;
        this.w = wei;
    }

    // constructor with another constructor
    Box (Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public static void information(){
        System.out.println("Running the box");
    }
}
