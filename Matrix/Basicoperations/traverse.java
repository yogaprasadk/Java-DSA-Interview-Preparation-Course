package Basicoperations;

public class traverse {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4, 5, 6},{7, 8, 9}};
        traversematrix(mat,0,0);
    }
    static void traversematrix(int[][] mat,int i,int j){
        //base condition
        if(i == mat.length - 1 && j == mat[0].length - 1){
            System.out.print(mat[i][j]+" ");
            return;
        }
        System.out.print(mat[i][j]+" ");


        if(j < mat[0].length - 1){
            traversematrix(mat,i,j+1);
        }

        else if (i < mat.length - 1){
            traversematrix(mat,i+1,0);
        }
    }
}
//time complexity: O(i * j)
//space complexity: O(i)