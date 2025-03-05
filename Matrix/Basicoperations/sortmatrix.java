package Basicoperations;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortmatrix {
    static void brute() {
        List<List<Integer>> c = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(1,2,3)),new ArrayList<>(Arrays.asList(4,7,1)),new ArrayList<>(Arrays.asList(3,6,7))));
        int s = c.size();

        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                x.add(c.get(i).get(j));
            }
        }
        Collections.sort(x);

        int k = 0;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                c.get(i).set(j,x.get(k++));
            }
        }

        System.out.println("Sorted Matrix Will Be");
        for (List<Integer> E:c){
            for(int row: E){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    static void better(){
        int[][] mat = { { 5, 4, 7 },
                { 1, 3, 8 },
                { 2, 9, 6 } };
        //find the size of matrix
        int row = mat.length;
        int col = mat[0].length;
        int len = row*col;
        sort(mat,row,col,len);
        printmatrix(mat,row,col);
    }

    static void printmatrix(int[][] mat, int row, int col) {
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void sort(int[][] mat, int row, int col, int len) {
        int size = len;
        // using bubble sort
        // loop to sort the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (mat[j/col][j%col] > mat[(j+1)/col][(j+1)%col]){
                    int temp = mat[j / col][j % col];
                    mat[j / col][j % col] = mat[(j+1) / col][(j+1) % col];
                    mat[(j+1) / col][(j+1) % col] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        brute();
        better();
    }
}
