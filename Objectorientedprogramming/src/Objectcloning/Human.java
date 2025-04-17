package Objectcloning;

// if we don't declare implements Cloneable  then it will throw error as CloneNotSupportedException
public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{2, 3, 4};
    }

    // object copy
    //    public Human(Human other){
    //        this.age = other.age;
    //        this.name = other.name;
    //    }

//    @Override
//    // Cloneable
//    public Object clone() throws CloneNotSupportedException{
//        // shallow copy
//        return super.clone();
//    }

    @Override
    // Cloneable
    public Object clone() throws CloneNotSupportedException {
        // shallow copy
        Human twin = (Human) super.clone();

        //deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
                twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
//cloneable interface is telling JVM that we are Clone the object type human