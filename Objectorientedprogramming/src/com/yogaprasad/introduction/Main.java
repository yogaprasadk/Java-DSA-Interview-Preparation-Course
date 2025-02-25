package com.yogaprasad.introduction;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Objects;
//
//public class Main {
//    public static void main(String[] args) {
//        //teacher asked to me to create the store details for 5 students
//        int[] numbers = new int[5];
//
//        //store 5 names
//        String[] names = new String[5];
//
//        //data of first students - rollno,marks,name
//        int[] rollno;
//        String[] name;
//        float[] marks;
//
//        //You have created  3 different values
//        // but i need these 3 different values into single datastructure.This contains where in oops
//        // class - class is combination of names,properties and functions.
//        // A class contains group of names,properties,functions and combine it into a single entity.
//        // It can be done by using class.
//        // Class start with the capital letter.
//
//        // Example
////        Student[] name = new Student[5];
//        // here every single element of student details can be stored in this single array.
//
//    Student prasad = new Student();
//        System.out.println(prasad.a);
//        System.out.println(prasad.b);
//        System.out.println(prasad.c);
//        System.out.println(prasad.d);
//        System.out.println(prasad.e);
//        System.out.println(prasad.f);
//        System.out.println(prasad.g);
//        System.out.println(Arrays.toString(prasad.h));
//
//        object n = new object();
//        System.out.println(n.ma);
//        System.out.println(n.name);
//
//    }
//}
//// create a class
//
//class Student{
//    // instance variable
//    byte a;
//    char b;
//   int c;
//   long d;
//   float e;
//   double f;
//   String g;
//   int[] h = new int[0];
//}
//
//// this keyword and constructor
//// To access the every variable of reference variable of the object -  This
//// Constructor means what type of object can be declared
//
//class object{
//    int ma;
//    String name;
//
//    object(){
//        this.ma = 3;
//        this.name = "Yp";
//    }
//}

class Main{
    public static void main(String[] args) {
        Student s = new Student(13,"34");
//        s.changename("Hello");
//        s.greeting();
        System.out.println(s.name);
        System.out.println(s.rollno);

        // create a another constructor
        Student random  = new Student(s);
        System.out.println(random.rollno);

        //create a constructor calling constructor into another constructor
//        Student tr =new Student();
    }
}

class Student{
    int rollno;
    String name;

    // default constructor
    Student(){
        this.rollno = 3;
        this.name = "Yogaprasad";
    }

//    // parameter constructor
//    Student(int rolno,String nm){
//        rollno = rolno;
//        name = nm;
//    }

    Student(int rolno,String nm){
        this.rollno = rolno;
        this.name = nm;
    }

    // create an another constructor
    Student(Student other){
        this.rollno = other.rollno;
        this.name = other.name;
    }

    // you can able to call using constructor with in another constructor
    /*internally: student()
    *
    * Student(){
    *   this(13,"ashok");
    * }
    * */
    void greeting(){
        System.out.print("This is :"+this.name);
    }

    void changename(String newname){
        name = newname;
    }
}

//in java the primitive datatypes cannot be created as objects.