package Sorting;
import java.util.Arrays;

//selection is one of the sorting algorithm
// it is used to sort an element
// it is used to select the element and change it position at its right position
public class Selectionsort{
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,5};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionsort(int[] arr) {

        // step1: find the maximum element
        // step2: Then Swap the element
        for (int i = 0; i < arr.length; i++) {
            int lastindex = arr.length - i - 1;
            int maxIndex = getmax(arr,0, lastindex);
            swap(arr,maxIndex,lastindex);
        }
    }

    static int getmax(int[] arr,int start,int end){
        int max = start;
        for (int i = start; i <= end; i++) {
                if(arr[max] < arr[i]){
                    max = i;
                }
        }
        return max;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

// Time complexity: O(n2)

/*
last  = arr.length - i - 1;
max
 */












