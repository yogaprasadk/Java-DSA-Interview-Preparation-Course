package Arrays;

import java.util.Arrays;

public class ArrayProblems
    /*
    * Swapping
    * reverse
    * Maximum
    * Minimum
    */
{
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,8,6};

        int[][] tda = new int[][]{{1,3,4},{2,5,7}};

            // swapping
            swapping(arr,0,3);
            // Reverse
            reverse(arr);
            //Maximum
        int maxans = maxi(arr); // single dimesion array
        System.out.println(maxans);
            // Minimum
        int minans = min(arr);
        System.out.println(minans);

            // find maximum in 2darray
        int ans = findmaximum(tda);
        System.out.println(ans);
    }

    static int findmaximum(int[][] arr) {
        int twoarrmax = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > twoarrmax){
                   twoarrmax = arr[row][col];
                }
            }
        }
        return twoarrmax;

//        for (int[] arrt: arr){
//            for(int ele: arrt){
//                if(ele > twoarrmax){
//                    twoarrmax = ele;
//                }
//            }
//        }
//        return twoarrmax;
    }

    static int maxi(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = i;
            }
        }
        return max;
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < min){
                min = i;
            }
        }
        return min;
    }

    static void reverse(int[] arr){
        //looping
        for (int i = arr.length - 1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
        //swapping
        System.out.println();
        swapping(arr,0,arr.length - 1);
    }

    static void swapping(int[] arr,int start,int end){
        int left = start;
        int right = end;

        //two pointer method
        while(left < right){ // 0 1 2 3      2 < 1 false
            int temp = arr[left]; // 0 1
            arr[left] = arr[right];// 0 3 2
            arr[right] = temp; // 3 0 2 1
            left++; // 1 2
            right--; // 2 1
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
