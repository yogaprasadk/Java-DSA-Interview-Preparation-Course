public class introduction {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,8,9},{4,5,6}};
        // arr.length is the length of row
        for(int row = 0;row<arr.length;row++){
            // arr[row].length is how many rows does the individual column has
            for (int col = 0;col<arr[row].length;col++){
                arr[row][col] = 10;
                // this statement is used to print in row form
                System.out.print(arr[row][col]+" ");
            }
            // this statement is used to print in tabular form
            System.out.println();
        }
    }
}
