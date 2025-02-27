package Arrays.Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class subarraywithgivensum {
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        //subarray

        ArrayList<Integer> res = subarraywithsum(arr,target);
        System.out.println(res);
    }
    static ArrayList<Integer> subarraywithsum(int[] arr,int target){
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;

        for (int i =0;i<n;i++){
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if(sum == target){
                    res.add(i+1);
                    res.add(j+1);
                    return res;
                }
            }
        }
        res.add(-1);
        return res;
    }
}
