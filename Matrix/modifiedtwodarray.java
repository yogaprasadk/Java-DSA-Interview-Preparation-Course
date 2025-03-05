public class modifiedtwodarray {
    public static void main(String[] args) {
        // modifiedtwodarray is known as jagged array
        //jagged array is defined as the all row of a matrix are not in same size
        // column size not be initialized at declaration
        // declared inside the loop
        int m = 3;
        int[][] arr = new int[m][];
        // row
        for (int row = 0; row < arr.length; row++) {
            arr[row] = new int[row + 1];// 0 - 1 element
            // column
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = row;
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}

// how it can be stored in memory
/*
arr = [0,1,2]
0 place => 0
1 place => 1 1
2 place => 2 2 2
 */
