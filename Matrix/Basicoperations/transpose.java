package Basicoperations;

public class transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        transposematrix(arr);
    }

    static void transposematrix(int[][] arr){
        int[][] matrix = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                matrix[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
