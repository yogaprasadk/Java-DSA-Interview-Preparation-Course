package staticexample;

public class singletonclass {
    //you have a class and only want to have one instance need to create for the class.
    // one instance need to be created => singleton classes.
    // if you create an object , you don't allow people to create object.hence you don't allow to use the constructor,

    //singleton is a class where you can only you can create one object for it.

    // it can be accessed within this class only.
    private singletonclass(){
    }

    // I need one instance.
    private static singletonclass instance;
    // let create a function that give a instance.
    public static singletonclass getInstance(){
            if(instance == null){
                instance = new singletonclass();
            }
            return instance;
    }
}