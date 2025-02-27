package Arrays.Problems;

public class Maximumsubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        brutemaximumsubarraysum(arr);
        optimalmaximumsubarraysum(arr);
    }
    // brute force
    static void brutemaximumsubarraysum(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currsum = 0;
            for (int j = i; j < arr.length; j++) {
                currsum += arr[j];
                res = Math.max(res,currsum);
            }
        }
        System.out.println(res);
    }
    //optimal
    static void optimalmaximumsubarraysum(int[] arr){
        int res = arr[0];
        int maxres = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxres = Math.max(maxres + arr[i],arr[i]);
            res = Math.max(res,maxres);
        }
        System.out.println(res);
    }

}
