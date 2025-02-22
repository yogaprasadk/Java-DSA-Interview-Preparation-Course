package Searching;

import java.util.Arrays;

public class BInarySearchProblems {
    public static void main(String[] args) {
        //binary search problems

        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 7;
        //ceil
        int ansceil = ceil(arr, target);
        System.out.println("Ceil : " + ansceil);

        //floor
        int ansfloor = floor(arr, target);
        System.out.println("Floor: " + ansfloor);

        //Leetcode 744 - find the smallest letter then target
        char[] letters = {'c', 'f', 'j'};
        char ctarget = 'c';
        char lettersans = nextGreatestLetter(letters, ctarget);
        System.out.println(lettersans);

        // Leetcode 34 - find the first and last position of an element in an array
        int[] rangeans = searchRange(arr, target);
        System.out.println(Arrays.toString(rangeans));

        //find the size of an array
        int ans = ans(arr, target);
        System.out.println(ans);

        //peakelement
        int peakans = peakIndexInMountainArray(arr);
        System.out.println(peakans);

        //Mountain array
        int moutarget = 13;
        int mounans = mountainarray(arr, moutarget);
        System.out.println(mounans);

        //Search in rotated array using recursion
        int rottarget = 7;
        int rotans = rotatedbinarysearchusingrecursion(arr,rottarget,0,arr.length - 1);
        System.out.println(rotans);

        //Search in rotated sorted array
        int rottar = 7;
        int rans = rotatedbinarysearch(arr,rottar,0,arr.length - 1);
        System.out.println(rans);

        //dupicate elements
        int[] duparr = {2,2,2,9,2};
        int dupans = findduplicatepivot(duparr);
        System.out.println(dupans);

        //check and find how many times does the array rotates
        int[] countarr = {4,5,6,7,0,1,2};
        int courotans = countrotatedsortedarray(countarr);
        System.out.println(courotans);

        //subarrays
        int subarrayans = subarrays(arr);
        System.out.println(subarrayans);
    }

    //ceil - greater than the target element
    static int ceil(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[arr.length - 1]) {
                return -1;
            }
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
        return start;
    }

    // floor - less than the target element
    static int floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if the target is greater than the greatest number in the array
            if (target > arr[arr.length - 1]) {
                return -1;
            }

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
        return end;
    }

    //find the smallest letter than target
    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // if the middle is lessthan than the target
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }

    //find the first and last position of an element in an sorted array
    static int[] searchRange(int[] nums, int target) {
        // Linear Search
//            int first = -1;
//            int end = -1;
//            for(int i = 0;i<nums.length;i++){
//                if(nums[i] == target){
//                    first = i;
//                    end = i;
//                }
//            }
//            return new int[]{first,end};


        // binary search
        int[] ans = {-1, -1};

        //check for first occurence of a target
        int first = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = first;
        ans[1] = end;

        return ans;
    }

    //this function will return index value of the target
    static int search(int[] nums, int target, boolean firstindex) { // why boolean is used? - Boolean is used because we need to find the startindex or lastindex
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        // Binary Search
        while (start <= end) { // 0 -1
            // mid element
            int mid = start + (end - start) / 2; // 0 +
            // if the middle element is less than the target
            if (target < nums[mid]) {
                end = mid - 1;
            }
            // if the middle is greater than the target
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            // if midelement found
            else {
                ans = mid;
                if (firstindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    // find the size of an array - position element sorted array infinte numbers
    static int sizeofarray(int[] arr, int start, int end, int target) {
        while (start <= end) {
            // mid element
            int mid = start + (end - start) / 2;

            // if the middle element is greater than the target
            if (target < arr[mid]) {
                end = mid - 1;
            }

            // if the middle is less than the target
            else if (target > arr[mid]) {
                start = mid + 1;
            }

            // if middle element found
            else {
                return mid;
            }
        }
//        if element not found return -1
        return -1;
    }

    static int ans(int[] arr, int target) {
        // first find range
        // start
        int start = 0, end = 1;
        //condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1;
            //double the box size
            // formula for make the box double => end = previous end + size of box * 2;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return sizeofarray(arr, start, end, target);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //  mid element
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in the decreasing part of an array
                // this ma be ans,but look at left
                // this is why end != -1;
                end = mid;
            } else {
                start = mid + 1;// you are in the ascending part of an array;
            }
        }
        // finally, the start == end gets point are the same place of the 2 checks
        // start and end are always trying to find max element in the above 2 checks
        return end;
    }
    static int mountainarray(int[] arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firsthalf =orderAgnosticbinarysearch(arr,0,peak,target);
        if(firsthalf != -1){
            return firsthalf;
        }
        return orderAgnosticbinarysearch(arr,peak +1,arr.length - 1,target);
    }

    static int orderAgnosticbinarysearch(int[] arr, int start, int end, int target) {
        // first check the array is sorted in ascending or descending.
        boolean isAscending;
        if (arr[start] <= arr[end]) {
            isAscending = true;
        } else {
            isAscending = false;
        }

        while (start <= end) {

            // mid element
            int mid = start + (end - start) / 2;

            // if midelement found
            if (target == arr[mid]) {
                return mid;
            }

            //if the element is ascending
            if (isAscending) {
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

    static int rotatedbinarysearchusingrecursion(int[] arr,int target,int start,int end){
        // first check if the start is greater than end
        if(start > end ){
            return -1;
        }

        // now need to find the middle value
        int mid = start + (end - start) / 2;

        // now apply binarysearch concept
        // now check start < mid
        if(arr[start] <= arr[mid]){
            //the target element must be greater than the start and less than middle search it
            if(target >= arr[start] && target <= arr[mid]){
                return rotatedbinarysearchusingrecursion(arr,target,start,mid - 1);
            }
            else{
                return rotatedbinarysearchusingrecursion(arr,target,mid + 1,end);
            }
        }
        //now checked the element is not present in between start and mid
        // so i need to check between mid + 1 and end
        if(arr[mid] <= arr[end]) {
            //the target element must be greater than the middle and less than end element and now search it
            if (target >= arr[mid] && target <= arr[end]) {
                return rotatedbinarysearchusingrecursion(arr, target, start, mid - 1);
            }
        }
        return rotatedbinarysearchusingrecursion(arr,target,mid + 1,end);
    }

    static int rotatedbinarysearch(int[] arr,int target,int start,int end){
        //check start > end
        if(start > end){
            return -1;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }

            // now check start to mid
            if(arr[start] <= arr[mid]){
                //now the target element is greater than the start and less than the middle element
                if(target >= arr[start] && target <= arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

            // now check start to mid
            if(arr[mid] <= arr[end]){
                //now the target element is greater than the start and less than the middle element
                if(target >= arr[mid] && target <= arr[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    // tofind pivot
    static int tofindpivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    // find the pivot with duplicates
    static int findduplicatepivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            //skip the duplicates
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                //check if start is pivot
                if(arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                //check if end is pivot
                if(arr[end] < arr[end - 1]){
                    return end;
                }
                end--;
            }

            else if ((arr[start] < arr[mid]) || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int countrotatedsortedarray(int[] arr){
        // to find pivot
        int pivot = tofindpivot(arr);
        return pivot + 1;
    }

    static int subarrays(int[] arr){
        int m = 2;
        int start = 0;
        int end = 0;

        //find maximum element in the array
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,arr[i]); // maximum element will be allocated
            end = end + arr[i]; // sum of array
        }
        // start will be min - 10 and end will be maximum - 21

        //apply binary search
        while (start < end){

            //try middle as the potential answer
            int mid = start + (end - start)/ 2;
            // calculate how many pieces you can divide as this sum

            int sum = 0;

            //no of pieces - can be initially 1
            int pieces = 1;

            for(int num: arr){
                // you cannot add in this subarray,makenew one
                // sa you can add
                if(sum + num > mid) {
                    sum = num;
                    pieces++;
                }
                else {
                    start = start + num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            }
            else{
                end = mid;
            }

        }
        return end;
    }

}