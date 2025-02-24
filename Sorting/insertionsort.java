package Sorting;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        // insertion sort means we are sorting array partially
        // for every index that you add put the index at the correct position of lhs
        // example:
        /*
        after 1st pass
        5 3 4 1 2
        at i = 0
        3 5 4 1 2

        after 2nd pass
        3 5 4 1 2
        at i = 1
        3 4 5 1 2

        after 3rd pass
        3 4 5 1 2
        for i = 2
        1 3 4 5

        after 4th pass
        1 3 4 5 2
        i = 3
        1 2 3 4 5

        after 5th pass
         1 2 3 4 5
         i = 4
         1 2 3 4 5
         */


        // why array runs from 0 to n - 2(for 4th pass) - to understand every element of i what its doing
        //i=0 j = i+1  //the element need to be smaller than j will check on left and everytime j need to be greater than zero
        // i need tobe <= n(lengthofarray)-2

        /*
         i<=n - 2   j>0
         0          1      5 3 4 1 2 -> 3 5 4 1 2     //i=0 -> 5 j = i+1 -> 3 // i will point to 5 and j will point to 3
         1          2      3 5 4 1 2 -> 3 4 5 1 2     //i=1 -> 5 j = i+1 -> 4 // i will point to 5 and j will point to 4
         2          3      3 4 5 1 2 -> 1 3 4 5 2    // i = 2 -> 5 j = i+1 -> 1 // i will point to 5 and j will point to 1
         3          4      1 3 4 5 2 -> 1 2 3 4 5    // i = 3 -> 5 j = i+1 -> 2 // i will point to 5 and j will point to 2
         */

        // very important,point
        // when j element not smaller than j - 1 element break the loop because it is already sorted


        // why we are taking n - 2
        //because we take i = 4 j = 5 it will become out of bound so we take n - 2

        //complexity worst case - O(n2)
        // if sorted Best case - O(N)

        // why we use insertion sort
        /*
        * adaptive: because it breaks the loop when the array is sorted when comparing to the previous element is greater so the number steps get reduced.so its adaptive.
        * Less swaps: when swapping was done in bubble sort it takes more steps to swap the numbers.while using insertion sort it reduces the swaps steps.
        * Stable
        * Used for small values for N ==> works good when array is partially sorted.It takes part in hybrid sorting algorithms */
         int[] arr = {5,3,4,1,2};
        Insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insertionsort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) { // you can use arr.length - 1 or <= arr.length - 2
            for(int j = i + 1;j>0;j--){
                // here the j element must be smaller than previous element  ex 5 6   j-1-> 5 j->6
                if(arr[j] < arr[j - 1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
