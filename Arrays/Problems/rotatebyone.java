package Arrays.Problems;

public class rotatebyone {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        // two pointer approach
        int i = 0, j = arr.length - 1;
        while (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        for (int k = 0; k <arr.length ; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
