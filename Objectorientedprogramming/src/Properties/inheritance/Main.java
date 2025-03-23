package Properties.inheritance;

//import static Properties.inheritance.Box.information;

// here l is giving error because we can't able to access from Box file.
public class Main {
    public static void main(String[] args) {
          // Single Inheritance - one class that extends another class.
//        information();
//        //constructor with no arguments.
//        Box box = new Box();
//        System.out.print(box.l + " "+ box.w+" "+box.h+"\n");
//
//        //constructor with one argument.
//        Box one = new Box(4);
//        System.out.print(one.l + " "+ one.w+" "+one.h+"\n");
//
//        //constructor with three arguments.
//        Box three = new Box(1,2,3);
//        System.out.print(three.l + " "+ three.w+" "+ three.h+"\n");
//
//        //constructor within another constructor
//        Box acons = new Box(box);
//        System.out.println(acons.h +" "+acons.l+" "+acons.w+"\n");
//
//        // boxweight
//        boxweight bw = new boxweight();
//        System.out.println(bw.h +" "+ bw.weight);

//        // boxweight with two or more parameters
//        boxweight tp = new boxweight(1,2,3,4);
//        System.out.println(tp.w+" "+tp.weight);

        // accessing parent class to childclass
//        Box n = new boxweight(1,2,3,4);
//        System.out.println(n);
        // why here weight can't able to access from child class?
//        it depends on reference variable not the object that determine what member can access.
         // it's referencing to type box weight.(in box class, if the weight is determined it will be accessed or if not it can't able to access);

        // accessing children class to parent class.

//          boxweight n = new box(1,2,4);
          // why here its giving error.
          /*
          *  There are many variables in both parent and children class.
          *  You are given access to variable that are ref type.
          *  hence, you should access to weight variable.
          *  this also means, that the ones you are trying to access should be initialized.
          *  but here, when the obj itself is of type parent class,how will you call the constructor of child class.

          // this below two points are the reasons for giving error.
          * *  the parent class didn't know what are the variables are declared in child class.
          *    but the child class know what are the classes that are actually declared in parent class.
          * */


        //Multilevel inheritance - one class can inherit from derived class and derived class can become parent class to another new class.
        // multilevel inheritance example
//        boxprice box = new boxprice(40,3,2);

        //Multiple inheritance - one class extends more than one class.
        // for real time example: Son can have character from both mother and father.
        // Multiple inheritance cannot support directly in java but it can obtained by using interfaces.
        // why multiple inheritance is not supported in java because child class get confused it get access by parent of both.

        // Hierarchical inheritance - one class can inherit many classes.

//        Box n = new boxweight();
        // why here it not calling the boxweight class method instead of calling method in Box class?
       // Ans: There is no pointer in child class because the method in parent class always run the method which the method is declared is no matter to the parent class.
        //ex:Box n = new boxweight();
        //when inheritance static method cannot be overridden.

        // static methods doesn't depend on objects and overridden is depend on object so the static method is cannot be overriden.
    }
}