package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        // arrays is collection of primitive and non primitive datatypes
        // we can able to store an data in array with single datatypes and we cant able to store multiple datatypes in an array
        // syntax : datatypes[] referenceingvariablename = new datatype[size];
        // primitive datatypes are stored in stack memory and non primitive datatypes are stored in heap memory
        //the dataelement which can be divided into smalldataelement is called non primitive datatypes
        //the dataelement which cant be divided into smalldataelement is called primitive datatypes


        //the way of declaration
        //1
        int[] arr = {1,2,3,4,5};
        //2
        int size = 3;
        int[] array = new int[size];
        //3
        int[] array1;
        array1 = new int[size];
        //4
        int[] array2 = new int[]{1,2,3,4};

        // to get an input of an array
        for (int i = 0; i < array.length; i++) {
            array[i] = S.nextInt();
        }

        // to print it
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array[i]);
        }//

        // for each loop to print single array
        for(int num:array){
            System.out.println(num);
        }

         // 2d arrays
         // in this 2d arrays we can able to print as an matrix
        // here declaration of row is compulsory but column is not compulsory to declare in 2d arrays

        //syntax: datatype[][] referencingvariablename = new datatype[size][size];
        //declaration of array
        //1
        int[][] twodarray1 = new int[3][];
        //2
        int[][] twodarray2 = {{1,2,3},{4,5,6}};


        // to take 2d array as input
        int[][] twodarrayinput = new int[3][3];
        for (int i = 0; i < twodarrayinput.length; i++) {
            for (int j = 0; j < twodarrayinput[i].length; j++) {
                twodarrayinput[i][j] = S.nextInt();
            }
        }

        //to print an 2darray
        for (int i = 0; i < twodarrayinput.length; i++) {
            // for every row we take value
            for (int j = 0; j < twodarrayinput[i].length; j++) {
                // dry run
                // i=0 j=0 i=0 j=1 i=0 j=2 .......
                // i=1 j=0 i=1 j=1 i=1 j=2 .......
                // take input and print it
                System.out.print(twodarrayinput[i][j]);
            }
            System.out.println();
        }

        // to print it is separate row like
        /*
        [1,2,3]
        [4,5,6]
        [7,8,9]
         */
        for (int i = 0; i < twodarrayinput.length; i++) {
            System.out.println(Arrays.toString(twodarrayinput[i]));
        }

        // for each loop for 2d array
        for(int[] arr1:twodarrayinput){
            System.out.println(Arrays.toString(arr1));
        }

        //Arraylist
        // THe arraylist can able to handle large dataset given as input
        // Syntax: ArrayList<Wrapperdatatype> referencevariable = new ArrayList<>();
        // you can able to take input more than the size given in arraylist
        // for example:
        /*
        ArrayList<Interger> m = new ArrayList<>(10);
         */

        //Arraylist methods

        // add --> To add element in array
        ArrayList<Integer> N = new ArrayList<>();
        N.add(3);
        N.add(23);
        System.out.println(N);

        //contains -> to check the element is present in the array
        ArrayList<Integer> Con = new ArrayList<>();
        Con.contains(2);
        System.out.println(Con);

        //set - The set is used to update the value at the respective index
        ArrayList<Integer> Set = new ArrayList<>();
        Set.set(0,2);
        System.out.println(Set);

        //remove - The remove element is used to remove the element from the respective index from its position
        ArrayList<Integer> rem = new ArrayList<>();
        rem.remove(0);
        System.out.println(rem);

        // To take an input
        ArrayList<Integer> inp = new ArrayList<>();
        for (int i = 0; i < inp.size(); i++) {
             inp.add(S.nextInt());
        }

        // to print the input
        for (int i = 0; i < inp.size(); i++) {
            System.out.println(inp.get(i));
        }

        // multiarraylist
        ArrayList<ArrayList<Integer>> n1 = new ArrayList<>();
        // initialization  //here if you don't initialization it will give null
        for (int i = 0; i < 3; i++) {
            n1.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            n1.get(i).add(S.nextInt());
        }
        System.out.println(n1);
    }
}