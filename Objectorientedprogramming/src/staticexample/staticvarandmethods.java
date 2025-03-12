package staticexample;

public class staticvarandmethods {
    public static void main(String[] args) {
        staticgreeting(); // it says that method cannot be referenced from static method

        // the non-static method can be accessed using classname.
        staticvarandmethods n = new staticvarandmethods();
        n.fun();
    }
    // if put static here it is get reference from the main function.
    // if you don't put static here it is not get reference from the main function.
    static void staticgreeting(){
        System.out.println("Static");
    }

    // the method which is not static and belongs to an object.
    void nonstaticgreeting(){
        System.out.println("Non static");
    }

    void fun(){
        nonstaticgreeting();
    }

    // static method doesn't have an instance.
    // non-static method have an instance.

    // static not refers to object
    // non-static refers to object.

    //you can't use instance method inside the static method
    /*
    for example:
    static void staticgreeting(){
        nonstaticgreeting();
    }
     */
    // you can use static method inside the instance method.
    /*
    for example:
    static void nonstaticgreeting(){
        staticgreeting();
    }
     */

}
