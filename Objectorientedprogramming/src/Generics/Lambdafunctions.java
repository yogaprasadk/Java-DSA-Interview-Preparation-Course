package Generics;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdafunctions {

    int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
      //LAmbda functions are inline functions that can be  written functions in oneline.
        ArrayList<Integer> ars = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ars.add(i + 1);
        }

//        for (Integer item : ars) {
//            System.out.println(item * 2);
//        }
//        it simplies
        ars.forEach((item) -> System.out.println(item *  2));

        // using consumer list
        Consumer<Integer> n = (item) -> System.out.println(item * 2);
        ars.forEach(n);


        // passing multiple parameters using interface
        operations s = (a, b) -> a + b;
        operations a = (c,d) -> c - d;
        operations d = (e,f) -> e * f;

        Lambdafunctions mycalulator = new Lambdafunctions();
        System.out.println(mycalulator.operate(1, 2, a));
    }
    private int operate(int a, int b, operations op){
        return op.op(a, b);
    }
}
interface operations {
    int op(int a,int b);
}
