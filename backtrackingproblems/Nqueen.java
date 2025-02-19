package backtrackingproblems;

public class Nqueen
{
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queen(board,0));
    }

    static int queen(boolean[][] board,int row)
    {
        if(board.length == row){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        // placing the queen and check for every row and column
        // loop
        for (int col = 0; col < board.length; col++) {
            // place the queen is it is safe
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count = count + queen(board,row+1);
                board[row][col]= false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col)
    {
        //check in vertical
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        // diagnoal left
        int maxleft = Math.min(row,col);
        for (int i = 1; i <= maxleft; i++) {
            if (board[row - i][col - i]){
                return false;
            }
        }

        // diagnoal right
        int maxright = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxright; i++) {
            if (board[row - i][col + i]){
                return false;
            }
        }
        return true;
    }


    static void display(boolean[][] board){
            //board row
            for(boolean[] row: board)
            {
                // element true
                for(boolean element: row){
                    if(element){ // if element is true print Q
                        System.out.print("Q ");
                    }
                    else{ // if element is not true print X
                        System.out.print("X ");
                    }

                }
                System.out.println();
            }
    }
}
