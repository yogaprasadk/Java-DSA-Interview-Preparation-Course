package Arrays.Problems;

public class firstnonrepeatingelementinanarray {
    public static void main(String[] args) {
        int[] arr = {9,4,9,6,7,4};
        int ans = bruteapproach(arr);
        System.out.println(ans);
    }

    static int bruteapproach(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    break;
                }
            }
            if (j == arr.length) {
                return arr[i];
            }
        }
        return -1;
    }
}
