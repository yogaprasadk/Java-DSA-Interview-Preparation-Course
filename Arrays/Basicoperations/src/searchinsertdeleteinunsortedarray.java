import java.lang.reflect.Array;
import java.util.Arrays;

public class searchinsertdeleteinunsortedarray {
    public static void main(String[] args) {
        //search an element
//        int arr[] = {12, 34, 10, 6, 40};
//        int place = 6;
//        int ans = findelement(arr, place);
//        System.out.println(ans);

        //delete
        int arr[] = {12, 34, 10, 6, 40};
        int n = arr.length;
        int key = 10;
        System.out.print("Before deletion");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        n = deleteelement(arr,n,key);

        System.out.println("Array after deletion");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

//        insertion int arr[] = {12,34,10,6,50};
        // step 1: fix the size
//          int[] arr = new int[6];
//          // assign values;
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 5;
//        arr[4] = 6;
//        int x = 4;
//        int pos = 3;
//        int n = 5;
//          n =
//        insertelement(arr,n,x,pos);
//          n = n + 1;
//        System.out.print("after insert");
//        for (int i = 0; i <=n; i++) {
//            System.out.print(arr[i]+" ");
//        }
    }

      static int findelement(int[] arr,int place){
      int ans = -1;
      for(int i = 0;i<arr.length;i++) {
        if(arr[i] == place){
            return i;
         }
        }
          return ans;
       }
//
//    static void insertelement(int[] arr,int len,int ele,int pos){
//        //6 5 3 2 1
//        // 6 5 4 3 2 1
//        for(int i = len - 1;i>=pos;i--) {
//            arr[i + 1] = arr[i];
//        }
//        arr[pos] = ele;
//    }

      static int deleteelement(int[] arr,int len,int key){
            int pos = findelement(arr,key);
            if(pos == -1){
                System.out.println("element not found");
                return pos;
            }
          for (int i = pos; i < len - 1; i++) {
                arr[i] = arr[i + 1];
          }
          return len - 1;

      }
}

