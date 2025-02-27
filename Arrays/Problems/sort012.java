package Arrays.Problems;
import java.util.*;
public class sort012 {
    public static void main(String[] args) {
                int[] arr = {0,1,0,2,1,2,2};
//              bruteapproach(arr);// tc:O(logn*n);
//              betterapproach(arr);// tc:o(2*n)
                expectedapproach(arr);//tc:o(n)
                System.out.println(Arrays.toString(arr));
    }

     static void bruteapproach(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void betterapproach(int[] arr){
        int ct0 = 0;
        int ct1 = 0;
        int ct2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                ct0 = ct0 + 1;
            }

            if(arr[i] == 1){
                ct1 = ct1 + 1;
            }

            if(arr[i] == 2){
                ct2 = ct2 + 1;
            }
        }

        int index = 0;
        for(int i = 0;i<ct0;i++){
            arr[index] = 0;
            index++;
        }

        for(int i = 0;i<ct1;i++){
            arr[index] = 1;
            index++;

        }
        for(int i = 0;i<ct2;i++){
            arr[index] = 2;
            index++;
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void expectedapproach(int[] arr){
        //using dutch national flag algorithm -
        // uses three pointers => low = 0,mid = 0,high = end - 1;
        // arr[0] + arr[low - 1] => 0
        //arr[low] + arr[mid-1] => 1
        // arr[high + 1] + arr[n-1] => 2
        int low = 0,mid=0,high = arr.length - 1;
        while(mid <= high){
            if(arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
