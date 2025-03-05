package Basicoperations;

public class search {
    static boolean brute(int[][] arr,int target){
        int row = arr.length;
        int col = arr[0].length;
        for (int i =0;i<row;i++){
            for (int j = 0; j < col; j++) {
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean better(int[][] arr,int target){
        int n = arr.length;
        int m = arr[0].length;
        int low = 0;
        int high = n - 1;
        int row = -1;
        // binary search
        while(low <= high){
            //mid
            int mid = (low + high) / 2;

            //find the row
            if (arr[mid][0] == target){
                return true;
            }

            if(target > arr[mid][0]){
                 row = mid;
                 low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if(row == -1) return false;
        return searchmid(arr[row],target);
    }
    static boolean searchmid(int[] arr,int target){
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (target == arr[mid])
                return true;
            if (target < arr[mid])
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return false;
    }

    static boolean optimal(int[][] arr,int target){
        int r = arr.length;
        int c = arr[0].length;
        int low = 0;
        int high = r*c - 1;

        while(low <= high){
            int mid = (low +  high) / 2;
            int row = mid/c;
            int col = mid%c;
            if(arr[row][col] == target){
                return true;
            }
            else if(arr[row][col] < target ){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{ 1,  5,  9},{14, 20, 21},{30, 34, 43}};
        int target = 14;
//      expected output : true or false
//   boolean brute_ans = brute(arr,target); // tc: O(m*n) sc: O(1)
//        System.out.println(brute_ans);
//    boolean better_ans = better(arr,target); // tc: O(logm + logn) sc:O(1)
//        System.out.println(better_ans);
        boolean optimal_ans = optimal(arr,target);
        System.out.println(optimal_ans);
    }
}
