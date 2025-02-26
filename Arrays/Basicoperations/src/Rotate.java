import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 2;

//        Leftrotatearray(arr,k);
//        System.out.println(Arrays.toString(arr));
//        Leftrotatearrayrec(arr,k);
//        System.out.println(Arrays.toString(arr));
//        rightrotate(arr,k);
//        System.out.println(Arrays.toString(arr));
        rightrotaterec(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    // left rotate or clockwise rotation array by k place - Brute Approach
    //Time complexity: O(k * n)
    //space complexity:
    static void Leftrotatearray(int[] arr,int k) {
        int start = 0;
        int end = arr.length - 1;
        //places for rotates
        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < end; j++) {
                arr[j] = arr[j + 1];
            }
            arr[end] = first;
        }
    }

    // Left rotate or clockwise direction by k places - Expected Approach
    static void Leftrotatearrayrec(int[] arr,int k){
              int start = 0;
              int end = arr.length - 1;
              int len = arr.length;
              k = k % len;
              reverse(arr,0,k - 1);
              reverse(arr,k,len-1);
              reverse(arr,start,end);
    }

    // reverse
    static void reverse(int[] arr,int st,int k){
        int start = st;
        int end = k;
        //using two pointer method
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //rightrotate
    static void rightrotate(int[] arr,int k){
        //kplaces
        for(int i = 0;i<k;i++){
            int end = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = end;
        }
    }

    //rightrotate recursion
    static void rightrotaterec(int[] arr,int k){
        // base condition
        if(k == 0){
            return;
        }
            int end = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
               arr[j] = arr[j - 1];
            }
            arr[0] = end;
        rightrotate(arr,k - 1);
    }
}
