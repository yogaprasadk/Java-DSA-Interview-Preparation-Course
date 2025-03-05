package Basicoperations;

import java.util.Arrays;
public class rowwisesorting {
    public static void sortRows(int[][] mat) {
        for (int[] row : mat) {
            Arrays.sort(row);
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {77, 11, 22, 3},
                {11, 89, 1, 12},
                {32, 11, 56, 7},
                {11, 22, 44, 33}
        };

        sortRows(mat);

        System.out.println("[");
        for (int[] row : mat) {
            System.out.print("  [");
            for (int j = 0; j < row.length; j++) {
                if (j > 0) System.out.print(", ");
                System.out.print(row[j]);
            }
            System.out.println("]");
        }
        System.out.println("]");
    }
}

//Time Complexity: O(r*c*log(c)) where r is the number of rows and c is the number of columns.
//Auxiliary Space: O(1)