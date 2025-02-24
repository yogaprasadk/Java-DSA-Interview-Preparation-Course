package Sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[] arr){
        // bubble sort algorithm is the one of the sorting algorithm and it is used to arrange an given elements from  small element to large element.
        // bubble sort is also known as shinking sort
        // It is also known as exchange sort
        // why it is also known as exchange sort? because it's arrange element in linear order by exchanging it positions.
        // while using this algorithm we can able to arrange an element from small element to large element
        // Bubble sort algorithm is also known as stable sort algorithm
        // what is stable sort algorithm is basically when you have the order should be same where the value is same.
        //stable - when original order is maintained for value are equal that is in sorted algorithm is called stable.
        // unstable - when original order is not maintained for value are equal that is in sorted algorithm is called unstable.

        //check the element is swapped or not
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for(int j = 1;j<= arr.length - 1;j++){
                if(arr[j] < arr[j - 1]){ // 4 < 5
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                        swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}

