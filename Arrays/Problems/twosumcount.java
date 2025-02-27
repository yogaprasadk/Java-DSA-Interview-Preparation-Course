package Arrays.Problems;

public class twosumcount {
    public static void main(String[] args) {
        int[] arr = {1,0,4,2,5,8};
        int tar = 6;
        bruteapproach(arr,tar);
    }

    static void bruteapproach(int[] arr, int tar) {
        int len = arr.length;
        int count = 0;
        for (int i = 0;i<len;i++){
            for(int j = i + 1;j<len;j++){
                if(arr[i] + arr[j] == tar){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
