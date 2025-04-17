package Generics.comparsion;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //here every object has two different types
        Student Kun = new Student(12, 89.55f);
        Student sun = new Student(5, 98.52f);
        Student raj = new Student(34, 95.25f);
        Student ram = new Student(23, 67.46f);
        Student sam = new Student(21,49.5f);

        Student[] list = {Kun,sun,raj,ram,sam};
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list);
        //sorted in ascending order
        Arrays.sort(list,new Comparator<Student>(){
            @Override
            public int compare(Student o1,Student o2){
                return (int) (o1.marks - o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));

        //sorted in descending order
        Arrays.sort(list,new Comparator<Student>(){
            @Override
            public int compare(Student o1,Student o2){
                return - (int) (o1.marks - o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));

        // to simply this we can use lambda functions


        // to implement this comparison
        // we need to use comparator

        if (Kun.compareTo(sun) < 0){
            System.out.println(Kun.compareTo(sun));
            System.out.println("Kunal is less than Sun");
        }
    }
}
