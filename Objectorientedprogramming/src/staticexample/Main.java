package staticexample;

public class Main {
    public static void main(String[] args) {
        // without these two un and ma we can able to access static variable.
        Human un = new Human("YOga", 21, 0, false);
        Human ma = new Human("Prasad", 31, 10, true);
        Human.message();

        singletonclass n = singletonclass.getInstance();
    }
}

/*          why public static void main(String[] args) has declared as static here?

            static method declared because static use the main method without creating an object to that class.
            main is the first thing will run when you run the code.
            if main is not there you can't able to run the code.

            if you don't put static over the main method obviously anything you need to run the code inside the class you need to create object for the class.
            Hence, you can able to run the main method without creating any object of the class with main is.

            static refers to the class not the object.
            static method is used to access the static data.
 */
