package Arrays.Problems;

public class missingnumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        int brute = bruteforceapproach(arr);
        System.out.println(brute);
        int optimal = optimalapproach(arr);
        System.out.println(optimal);
    }

    static int bruteforceapproach(int[] arr) {
        int len = arr.length + 1;
        for (int i = 1; i <= len; i++) {
            boolean find = false;
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == i) {
                    find = true;
                    break;

                }
            }
            if (!find) {
                return i;
            }
        }
        return -1;
    }
    static int optimalapproach(int[] arr){
        int len = arr.length + 1;
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
//        sum of n terms formula - n *  (n+1) / 2
        int extrasum = (len * (len + 1)) / 2;

        return extrasum - sum;
    }
}
