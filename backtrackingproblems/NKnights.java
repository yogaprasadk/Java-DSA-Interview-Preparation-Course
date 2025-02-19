package backtrackingproblems;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] boards = new boolean[n][n];
        int target = 4;
        knights(boards,0,0,target);
    }
    static void knights(boolean[][] boards,int row,int col,int target){
        // base condition
        if(target == 0){ // knights when become 0
            // just try to display it
            display(boards);
            System.out.println();
            return;
        }

        // when row and column becomes unbound just skip it
        if(row == boards.length - 1 && col == boards.length){
            return;
        }

        // when column becomes same length to boards length
        if(col == boards.length){
            // recursive calls
            knights(boards,row + 1,0,target);
            return;
        }

        if(isSafe(boards,row,col)){
            boards[row][col] = true;
            knights(boards,row,col+1,target - 1);
            // backtrack condition to false
            boards[row][col] = false;
        }

        // in any case it is not safe just move a head knights remain same
        knights(boards,row,col+1,target);
    }

    private static boolean isSafe(boolean[][] boards, int row, int col) {
            if (isValid(boards,row - 2,col - 1)){
                if(boards[row - 2][col - 1]){
                    return false;
                }
            }

            if (isValid(boards,row - 1,col - 2)){
            if(boards[row - 1][col - 2]){
                return false;
              }
            }

            if (isValid(boards,row - 2,col  + 1)){
            if(boards[row - 2][col + 1]){
                return false;
             }
            }

            if (isValid(boards,row - 1,col + 2))
            {
                return !boards[row - 1][col + 2];
            }
            return true;
    }

    // if is not out of bound
    static boolean isValid(boolean[][] boards,int row,int col){
        return row >= 0 && row < boards.length && col >= 0 && col < boards.length;
    }


    static void display(boolean[][] board){
        //board row
        for(boolean[] row: board)
        {
            // element true
            for(boolean element: row){
                if(element){ // if element is true print K
                    System.out.print("K ");
                }
                else{ // if element is not true print X
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
