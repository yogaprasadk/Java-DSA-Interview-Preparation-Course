package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//      list - Arraylist,Linkedlist,Vector,Stack
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new LinkedList<>();
        List<Integer> s3 = new Vector<>();
        List<Integer> s4 = new Stack<>();

        s2.add(34);
        s2.add(24);
        s2.add(53);
        System.out.println(s2);

//        Vector - Vector Synchronization means One thread can access at one time (it will like abstraction)
//        Arraylist can access more thread at a time
        /*
        Arraylist is faster than Vector because Arraylist can able to do more thread at a time while vector can do one thread at a time.
         */
    }
}
