package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        // searching - we can search for something
        // Two types of searching - Linear and Binary
        // Time Complexity: linear => O(n) Binary => O(log n)
        // Linear Search is one of the technique searching for some element
        // every element can be accessed

        //question 1: 14 is existed or not
        int[] arr = {16,78,234,16,14,5,3};
        int target = 14;

        boolean ans = exist(arr,target);
        System.out.println(ans);

        //question 2: 45 is existed or not in 2d array
        int[][] twodimarr = {{1,5,3},{52,5,25},{3,6}};
        target = 45;

        boolean twodimans = twodimexisted(twodimarr,target);
        System.out.println(twodimans);

        //question 3: y is presented in yogaprasad or not;
        String que = "Yogaprasad";
        char ch = 'Y';
        boolean stans = string(que,ch);
        System.out.println(stans);

        //question 4: search in 2d array
        int[][] searchtwodim = {{1,2},{3,4},{5,6}};
        int twodimtarget = 3;
        System.out.println(Arrays.toString(searchtwodimarray(searchtwodim,twodimtarget)));
    }

    static int[] searchtwodimarray(int[][] arr, int target) {
        for(int row = 0;row < arr.length;row++){
            for (int col = 0; col < arr[row].length; col++) {
                 if(arr[row][col] == target){
                     return new int[]{row,col};
                 }
            }
        }
        return new int[]{-1,-1};
    }

    static boolean exist(int[] arr,int target){
        for(int ans : arr){
            if(ans == target) return true;
        }
        return false;
    }

    static boolean twodimexisted(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            while (j < arr[i].length) {
                if (target == arr[i][j]) {
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    static boolean string(String st,char ch){
        // method 1: simple method
//        for(int i = 0;i<st.length();i++){
//            if(st.charAt(i) == ch){
//                return true;
//            }
//        }
//        return false;

       // method2:  iterative method
        for(char c: st.toCharArray()){
            if(c == ch){
                return true;
            }
        }
        return false;
    }
}
