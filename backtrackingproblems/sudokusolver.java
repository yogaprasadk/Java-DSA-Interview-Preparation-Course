package backtrackingproblems;

public class sudokusolver {
    public static void main(String[] args) {
            int[][] board = new int[][]{
                    {3,0,6,5,0,8,4,0,0},
                    {5,2,0,0,0,0,0,0,0},
                    {0,8,7,0,0,0,0,3,1},
                    {0,0,3,0,1,0,0,8,0},
                    {9,0,0,8,6,3,0,0,5},
                    {0,5,0,0,9,0,6,0,0},
                    {1,3,0,0,0,2,5,0,0},
                    {0,0,0,0,0,0,0,7,4},
                    {0,0,5,2,0,6,3,0,0},
            };
            if (solve(board)){
                display(board);
            }
            else{
                System.out.println("cannot solve");
            }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyleft = true;

        // this is how we are replacing row and col from the arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0;j<n;j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyleft = false;
                    break;
                }
            }
            // if you found some empty element in row,then break
            if(emptyleft == false){
                break;
            }
        }
        if (emptyleft == true) {
            return true;
            // sudoku is solved
        }

        //backtracking
        for (int number = 1; number <=9; number++) {
                if(isSafe(board,row,col,number)){
                    board[row][col] = number;
                    if (solve(board)){
                        // found the answer
                        return true;
                    }
                    else{
                        board[row][col] = 0;
                    }
                }
        }
        // after element the sudoku can solve means return false
        return  false;
    }

    private static void display(int[][] board) {

        for (int row[] : board) {
            for (int nums: row) {
                System.out.print(nums+" ");

            }
            System.out.println();
        }
    
    
    }

    static boolean isSafe(int[][] board,int row,int col,int num){
        // check the row
        for(int i = 0;i< board.length;i++){
            // check if the number is in the row
            if(board[row][col] == num){
                return false;
            }
        }

        for(int[] nums : board){
            // check if the number is in the col
            if(nums[col] == num){
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(Math.sqrt(board.length));
        int rowstart = row - row % sqrt;
        int colstart = col - col % sqrt;

        for (int r = 0; r < rowstart + sqrt; r++) {
            for (int c = 0; c < colstart + sqrt; c++) {
                   if(board[row][col] == num){
                       return false;
                   }
            }
        }

        return true;

    }
}
