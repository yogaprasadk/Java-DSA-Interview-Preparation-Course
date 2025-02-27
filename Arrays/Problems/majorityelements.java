package Arrays.Problems;

public class majorityelements {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 3, 5, 1};
        int bruteans = bruteapproach(arr);
        System.out.println(bruteans);
    }

    static int bruteapproach(int[] arr) {
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            int count = 0;
            for(int j = 0;j<n;j++){
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > n/2){
                return arr[i];
            }
        }
        return -1;
    }
}
