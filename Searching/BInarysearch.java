package Searching;

public class BInarysearch {
    public static void main(String[] args) {
        // Binary Search
        // It is one of the searching algorithm
        // It is an algorithm which can be search an element in an certain amount of space.
        // Binary search will applicable in sorted area.
        //Time complexity: O(Log2 n)


        // code for Binary Search
        int[] arr = {1,3,5,2,523,34,256,236};
        int target = 5;

        int ans1 = binarysearch(arr,0,arr.length-1,target);
        System.out.println(ans1);
        int ans2 = recursivebinarysearch(arr,0,arr.length-1,target);
        System.out.println(ans2);

        // here why orderagnosticbinarysearch used here because we don't know that the given array is in ascending order or descending order'
        int ans3 = orderAgnosticbinarysearch(arr,0,arr.length - 1,target);
    }

    static int orderAgnosticbinarysearch(int[] arr, int start, int end, int target) {
        // first check the array is sorted in ascending or descending.
        boolean isAscending;
        if(arr[start] <= arr[end]){
            isAscending = true;
        }
        else{
            isAscending = false;
        }

        // mid element
        int mid = start + (end - start) / 2;

        while(start <= end) {
            // if midelement found
            if (target == arr[mid]) {
                return mid;
            }

            //if the element is ascending 
            if(isAscending) {
                // if the middle element is greater than the target
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                // if the middle is less than the target
                else {
                    end = mid - 1;
                }
            }
            // if the element is descending
            else {
                // if the target element is less than the mid
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                // if the middle is greater than the target
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;

    }
    static int binarysearch(int[] arr, int start,int end, int target) {
        // mid element
        int mid = start + (end - start) / 2;

        while(start <= end) {
            // if midelement found
            if (target == arr[mid]) {
                return mid;
            }

            // if the middle element is greater than the target
            else if (target > arr[mid]) {
                start = mid + 1;
            }

            // if the middle is less than the target
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int recursivebinarysearch(int[] arr,int start,int end,int target){
        // base case
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(target == arr[mid]){
            return mid;
        }

        if(target > arr[mid]){
            return recursivebinarysearch(arr,mid + 1,end,target);
        }

        else{
            return recursivebinarysearch(arr,start,mid - 1,target);
        }
    }
}
