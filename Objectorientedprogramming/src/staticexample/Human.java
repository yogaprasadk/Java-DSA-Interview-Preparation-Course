package staticexample;
public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    static long population;
    // constructor
    // when we use static to an instance variable is called as static variable.
    // for example: int salary (now it is an instance variable) and when we use static to this it will become as static variable.
   //  static variable doesn't depend on object
    public Human(String nav,int osu,int samblo,boolean forat){
         this.name = nav;
         this.age = osu;
         this.salary = samblo;
         this.married = forat;
        // when use static here for instance variable in the constructor use this keyword for references or instead of this use class name to it.
//         Human.population = population + 1;
         // for static variables use this
          Human.population  = population + 1;
    }
    // what if there is some set of properties that is common to human beings - population
    //the properties of population doesn't depend on object
    // Such Properties doesn't directly relate to object but common to all the object is known as Static Variables or Static Methods.
    //for example:
    //static long population; // doesn't directly relate to human.
    static void message(){
        // you cant able use this keyword inside in the static method.
//        System.out.println(this.age);
        System.out.println("Hello World");
    }
}

/* what is static variable? - whenever a variable is created with static,it can access before any of the object of the class been created without referencing the object.
* simple statement: it can access without creating an object or referencing to an object

   static can be declared in two ways - used for creating variables and methods
   * most common static method is
   public static void main(String[] args)
*/