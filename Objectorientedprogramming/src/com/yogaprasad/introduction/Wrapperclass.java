package com.yogaprasad.introduction;

public class Wrapperclass {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a +" "+ b);
        final int c = 4;
        //c=5; // here c cant be modified because c remains constant of using final

        /*
        PRIMITIVE DATATYPES CANT BE MODIFIED WHILE USING WITH FINAL KEYWORD
        NON PRIMITIVE DATATYPES CAN BE MODIFIED WHILE USING WITH FINAL KEYWORD but You cant reassign it
         */

        final Final A = new Final("Yoga");
        // you can do like this
        A.name = "YP";
        //but you cant do like this when class is final
        A = new Final("dasdasd");

        //but you can do like this when class is not final
        A = new Final("gsdgsdg");
    }

    static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
    }


//    } here a is accessible only within this scope
}
/*
why it dont swap?

because in java there is no pass by reference there is only pass by value
in primitive there is only pass by value
 */

//   use Wrapper class
/*

    Integer a = 34;
    Integer b = 44;

    swap(a,b);
    system.out.print(a + "" + b);
// here why not swapped because here a is considered as final (final is means constant)
    static void swap(Integer a,Integer b)
    {
        int temp = a;
        a = b;
        b = temp;

    }
 */

class Final{
    final int num = 10;
    String name;
    // constructor
    public Final(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Print");
    }
}


// what is garbage collector?
