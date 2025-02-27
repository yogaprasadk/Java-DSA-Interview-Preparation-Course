package Arrays.Problems;

public class subarraywithzerosum {
    public static void main(String[] args) {
        int[] arr= {-3, 2, 3, 1, 6};
        boolean ans = bruteapproach(arr);
        System.out.println(ans);
    }

    static boolean bruteapproach(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            if(sum == 0) return true;
            for (int j = i+1; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == 0) {
                    return true;
                }
            }
        }
        return false;

    }
}
