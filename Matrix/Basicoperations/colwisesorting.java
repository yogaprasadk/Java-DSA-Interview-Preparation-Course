package Basicoperations;

import java.lang.reflect.Array;
import java.util.Arrays;

public class colwisesorting {
    public static void main(String[] args) {
        // Input
        int[][] mat = { { 1, 6, 10 },
                { 8, 5, 9 },
                { 9, 4, 15 },
                { 7, 3, 60 } };

        int row = mat.length;
        int col = mat[0].length;

        colsorting(mat,row,col);
    }
    static void colsorting(int[][] mat,int row,int col){
        // Function call to find transpose
        // of the matrix mat[][]
        int[][] arr = transpose(mat,row,col);

        // row wise sorting
        rowsorting(arr);

        //calculate the transpose of mat[][]
        mat = transpose(arr,row,col);
        for (int rows = 0;rows<mat.length;rows++){
            for (int cols = 0; cols < mat[rows].length; cols++) {
                System.out.print(mat[rows][cols]);
            }
            System.out.println();
        }
    }
    static int[][] transpose(int[][] arr,int row,int col){
        int[][] mat = new int[row][col];
        for (int rows = 0; rows < mat.length; row++) {
            for (int cols = 0; cols < arr[rows].length; col++) {
                    mat[cols][rows] = mat[row][col];
            }
        }
        return mat;
    }

    static void rowsorting(int[][] arr){
        for(int[] row:arr){
            Arrays.sort(row);
        }
    }
}
