package Objectcloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human human = new Human(21, "Yogaprasad");
//        Human twin = new Human(human);
        // the object copy problem is taking large amount of time to execute.
        // to resolve this we need to use Object Cloning.

        //Object CLoning means we need to create exact copy of an object.
        //clone is a method,Object is used to make these copies.
        // Clonable is interface that can be present in Java.lang package.

        Human clone = (Human) human.clone();
        System.out.println(clone.age+" "+clone.name);
        System.out.println(Arrays.toString(clone.arr));
        clone.arr[0] = 100;
        // this is shallow copy
        System.out.println(Arrays.toString(human.arr));
        System.out.println(Arrays.toString(clone.arr));

        // Clone of an object is faster than copying of an object.
    }
}
