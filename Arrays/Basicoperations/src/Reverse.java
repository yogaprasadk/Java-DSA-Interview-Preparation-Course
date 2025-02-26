import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
        forloopreverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    //method1
    static void reverse(int[] arr,int start,int end) {
    for(start = 0;start<=end;){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
     }
    }

    //method2
    static void forloopreverse(int[] arr){
        for (int i = arr.length; i > 0 ; i--){}
    }
}
