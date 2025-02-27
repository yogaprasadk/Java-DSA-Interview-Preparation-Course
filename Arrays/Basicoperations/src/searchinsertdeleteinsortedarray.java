
public class searchinsertdeleteinsortedarray {
    public static void main(String[] args) {
        //insert
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int n = 5;
        insertarray(arr,n,6,5);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //search can be done by binary search in sorted array
        // deletion
        deletion(arr,n,4,3);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //1 2 3 4 5 6
    //0 1 2 3 4 5

    static void deletion(int[] arr, int n, int ele, int pos) {

        for(int i = pos;i<n-1;i++){ //6 5 4 3
            arr[i] = arr[i + 1];
        }
    }

    static void insertarray(int[] arr,int len,int ele,int pos){
        for (int i = len; i < pos; i++) {
            arr[i - 1] = arr[i];
        }
        arr[pos] = ele;
    }
}
