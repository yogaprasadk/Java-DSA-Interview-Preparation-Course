package introduction;

public class Introduction {
    public static void main(String[] args) {
        //store 5 roll-nos
        int[] no = new int[5];

        //a teacher says to store 5 names
        String[] names = new String[5];

        //a teacher says you need to store datatypes
        /*
        1.name
        2.mark
        3.roll-no
         */

        String[] na = new String[3];
        float[] n = new float[3];
        int[] s = new int[3];

        //every single element contains these three elements this concept is called object-oriented programming concepts
        //Class -group of functions and properties. Class  is a name,
        // the three properties can be combined into a single entity is done via classes
        // Class starts with capital letter

        Student[] students = new Student[5];
        // every property and functions that can be present inside the class

        //to initialize variable yoga I need to declare new keyword with object.
 //       Student yoga = new Student();  // yoga is a reference variable // referencing variable - yoga is initialized to object Student
        Student yoga = new Student(67,"yoga",52); // when you create constructor outside the main function and passing parameter to it and instance variable get referenced by this keyword and the parameter assigned to it ex:(this.name = nav) the values will be passed inside the constructor it is known as parameter constructor.
     //   System.out.println(yoga); // if you print the reference variable it will give output as introduction.Student@6acbcfc0   (@6acbcfc0 - randomly generated hash value)
       // System.out.println(yoga.nav); // if you print the reference variable it will give output as null (reason: check line 39).

        // you can declare like this in the main function, or you can declare it in instance variable itself;
   //     yoga.nav = "Yoga prasad";
  //      yoga.rno = 21181;

        // The output will be what you declared inside the main function it will print it.
        //if the instance variable has any it cant print the value because the value is already initialised in main function so the value present in class variable not be printed.

        //yoga.changename("Cricket Lover"); // if u assign a function with parameter and the instance variable is assigned to the parameter and now the parameter value get printed.
        System.out.println(yoga.nav);
        System.out.println(yoga.rno);
        System.out.println(yoga.n);
        //yoga.fun();

        // passing constructor to another object constructor
        Student random = new Student(yoga);
        System.out.println(random.nav);

        //call constructor from another constructor
        Student random2 = new Student();
        System.out.println(random2.nav);

        //passing reference variable to another reference variable
        Student one = new Student();
        Student two = one; // here one is assigned to two variable which means the both are point to the new Student()
        one.nav = "yp";
        System.out.println(two.nav); // yp

        // if you don't assign any value to the variable using dot operator the value that is declared in the instance variable value will be printed.
        // reference variable are stored in stack memory
        // objects are stored in heap memory
        // yoga reference variable point to the object Student
        // if no object is assigned to a reference variable it gives output as null in java.
        // for primitive datatypes it will give output as 0 and for boolean as false and non primitive datatypes it will give null
        // the new keyword allocates dynamically values in memory. dynamically means allocates object at runtime and return reference to it.
        // The things that on the left side of the equals happens at compile time and the things on the right hand side of equal happens at runtime

        //constructor => it will be created when object is created.
        //in constructor, you can able to pass the value inside the arguments.
        // example student yoga = new student("yoga",21,21181);
        // in class,constructor is a special type of function.
        // this is called by default constructor.
        // constructor is a function,that runs when you create an object   it allocates some variable.
        //the arguments in constructor get bind with object
    }
}
     // create a class
     // This is the way you can able to create a class
     // class is a logical constructor
     // class is template of object
     // object is an instance of class
     //instance means physical stuff of the class
     // object is a physical reality.The object is occupying the space in memory.
     //sytnax: Class classname(object)
     class Student {
         String nav;
         float n ;
         int rno;

         //the variables that is declared inside the object is called instance variable.
         // student properties can be accessed by using dot operator

         // we need a way to add the values of the above properties.
         // one word that can be access every object
         //  to access the referencing variable we need to use this keyword.

        /* Student()  { // this constructor will run when you create object in main function
          this.nav = "yoga";
            this.n = 34.6f;
            this.rno = 30;
        }*/

         // now passing some values inside the constructor
         Student(int rlno,String peyar,float mark){
             this.nav = peyar;
             this.n = mark;
             this.rno = rlno;
             // here the parameter name and instance variable name should not be same when this keyword not declared.
             // here if you don't pass this keyword it don't get modified.
         }

         // this keyword with referencing variable inside the constructor get replaced with the instance variable.
         // basically,this keyword means when you are calling the constructor
         // whenever you create a new object is created it will go inside in the constructor.
         // the value that is present inside the constructor with this keyword referencing variable is get printed in main function
         // when you change the referencing variable value in main function it will get changes in reference will be point to the assigned values, and it will be printed.
         // the value assigned in instance variable outside the constructor the value won't print if the constructor is declared and the variable is get referenced with this keyword
         /*
         for example:
         class student{
         int roll-no = 4;
         student(){
            this.roll-no = 5;
         }
         public static void main(String[] args){
               student s = new student();
                s.roll-no;
                system.out.print(s.roll-no); // output: 5;
                // if reassigned
                s.roll-no =45;
                system.out.print(s.roll-no); // output: 45;
         }
         }
          */

            // you can create function inside the class.
         void fun(){
             System.out.println("My Name is: "+nav);
         }

         // change name
         void changename(String newname){
             nav = newname;
         }

         // a constructor that takes values of another object
         Student (Student other){
             this.rno = other.rno;  // random.rno = yoga.rno
             this.n  = other.n;     // random.n = yoga.n
             this.nav = other.nav; // random.nav = yoga.nav
         }

         // call constructor from another constructor
         Student(){
            this (3,"yoga",34.0f);
         }
     }

    // reallife example for class - cars
    /*
      using the template so many are companies are creating their cars
      ex: tata,toyota,honda
      the properties of cars contains:
      1.engine
      2.price
      3.seats
    */

     /*
     the properties are same of cars but their values are different
     For Example:
     Tata has 2 seats,petrol engine,prices - 45000
     Toyota has 4 seats,diesel engine,prices - 50000
     Honda has 6 seats,electric engine,prices - 56000
     */

     /*
     object contains three essential properties
     state - value from datatype
     behaviour - functions
     identity - one object is different from other
     */

//     lecture 1: covered - objects,class,constructors,this,final,new,wrapper class.
/*
   constructor covered 4 major things
   1.default
   2.parameter passing
   3.constructor with in another constructor
   4.constructor calling function in another constructor.
 */