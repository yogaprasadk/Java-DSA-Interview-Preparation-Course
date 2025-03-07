package com.yogaprasad.introduction;

public class wrapper {
    public static void main(String[] args) {
        //primitive datatypes can be created using new keyword is called wrapper class.

        Integer a  = 45;// it is an object
        int b = 4;
        int c = 7;
        swap(b,c);
        System.out.println(a +" "+b);
        // why it don't swap because java don't use pass by reference it can be passed by using pass by value.
        // In wrapper class also it don't get swap because the wrapper classes referencing to the final keyword.
        //final keyword is used to prevent content from it to be modified.you can make it like constant in javascript.
        // when the datatype is in primitive using final keyword you cant be modified.
        // ex: final int INCREASE = 20;
        final int base = 3;
       // base = 5;//it will give error
        // when you used to declare  final with variable it needs to be initialized.

    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    A n = new A("kunal");
    // you can use final keyword for non primitive datatypes.We can make change in value but can be reassigned.
    // final A st = new A();
    //st.name = "yo" //.We can make change in value
    //st = s; //can't be reassigned.
}
// the wrapper class has so many properties and functions.

class A{
    //final int a; // here it will give error like value isn't initialized.
    // You need to initialize value.
    final int a = 10;
    String name;
    //shortcut for creating constructor in intellij idea ide - Press alt and enter at same time
    public A(String name){

    }

}
