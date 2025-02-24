package Sorting;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
                // question is: if i need to sort the entire array in one single for loop then you can use cyclic sort

        // important point to be noted: when given ranges from 1 to N: use cyclic sort
        // question asked:
//        1.find the missing number
//        2.unsorted array if it is unsorted find the missing number
//        3.find the duplicate number in the array

        /*
        How to do cyclic sort
        3 5 2 1 4 here n= 5 are from 0 to 4
        // imagine that In the ideal world the array is sorted in that case all the indexes are at correct indexes
        after sorting: 1 2 3 4 5  index = value - 1
        // let explain it  3->0 5->1 2->2 1->3 4->4
        // apply:
        3 - 1 = 2  -->   3 is at 2nd index
        5 - 1 = 4  -->   5 is at 4th index
        2 - 1 = 1  -->   2 is at 1st index
        1 - 1 = 0   -->  1 is at 0th index
        4 - 1 = 3   -->  4 is at 3rd index

        //swaps it that correct index
        3 5 2 1 4 --> 3 is at correct index - NO.So,Swaps it at its correct index 2 --> then it will become after swaps: 2 5 3 1 4
        2 5 3 1 4 --> 1 is at correct index - No.So,Swaps it at its correct index 1 --> then it will become after swaps: 5 2 3 1 4
        5 2 3 1 4 --> 5 is at correct index - No.So,Swaps it at its correct index 4 --> then it will become after swaps: 4 2 3 1 5
        4 2 3 1 5 --> 4 is at correct index - No.So Swaps it at its correct index 3 --> then it will become after swaps: 1 2 3 4 5
        n - 1 of swaps need to made

        // Time complexity: O(N)
         */
              int[] arr = {3,5,2,1,4};
              Cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cyclicsort(int[] arr){
            // here while loop is because N ranges used in used
            int i = 0;
            while(i < arr.length){
                int correct =  arr[i] - 1;
                if(arr[i] != arr[correct]){
                    swap(arr,i,correct);
                }
                else {
                    i++;
                }
            }
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
