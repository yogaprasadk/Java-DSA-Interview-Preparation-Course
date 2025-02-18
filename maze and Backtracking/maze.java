package maze;

import java.util.ArrayList;
import java.util.Arrays;

// maze problems
public class maze {
    public static void main(String[] args) {
//         Problem 1.count
        System.out.println( count(3,3));
        System.out.println();

        // now print path
        path("",3,3);
        System.out.println();
        // arraylist
        System.out.println(pathlist("",3,3));

//        pathdiagnol
        System.out.println(pathdiagnollist("",3,3));

        // path restrictions
        boolean[][] path1 = {{true,true,true},{true,false,true},{true,true,true}};
        pathrestrictions("",path1,0,0);

//        all path
        boolean[][] path2 = {{true,true,true},{true,true,true},{true,true,true}};
        pathall("",path2,0,0);

        //print allpath
        boolean[][] maze = {{true,true,true},{true,true,true},{true,true,true}};
        int[][] path = new int[maze.length][maze[0].length];
        pathallstring("",path2,0,0,path,1);

    }

//    //count
    static int count(int row,int col){
        // base condition
        if(row == 1 || col == 1){
            return 1;
        }
        //left
        int left = count(row - 1,col);
        //right
        int right = count(row,col - 1);

        return left + right;
    }
//
//    //pattern of path
    static void path(String p,int row,int col){
        // base condition
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        //row > 1
        if(row > 1){
            path(p + 'D',row - 1,col);
        }

        //col > 1
        if(col > 1){
            path(p + 'R',row,col - 1);
        }
    }

    // using arraylist

    static ArrayList<String> pathlist(String p,int row,int col){
        ArrayList<String> list = new ArrayList<>();
        if(row == 1 && col == 1){
            list.add(p);
            return list;
        }

        ArrayList<String> listr = new ArrayList<>();

        if(row > 1){
            listr.addAll(pathlist(p + 'D',row - 1,col));
        }

        if (col > 1){
            listr.addAll(pathlist(p+ 'R',row,col - 1));
        }

        return listr;
    }

    static ArrayList<String> pathdiagnollist(String p,int row,int col){

        if(row == 1  && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if( row > 1 && col > 1){
            list.addAll(pathdiagnollist(p + 'D',row - 1,col - 1));
        }

        if(row > 1){
            list.addAll(pathdiagnollist(p + 'V',row - 1,col));
        }

        if(col > 1){
            list.addAll(pathdiagnollist(p + 'H',row,col - 1));
        }
        return list;
    }

    public static void pathrestrictions(String p,boolean[][] path,int row, int col){
        if(row == path.length - 1 && col == path[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!path[row][col]){
            return;
        }

        //down
        if(row < path.length - 1){
            pathrestrictions(p + 'D',path,row + 1,col);
        }

        // right
        if(col <  path[0].length - 1){
            pathrestrictions(p + 'R',path,row,col + 1);
        }
    }

    public static void pathall(String p,boolean[][] path,int row, int col){
        if(row == path.length - 1 && col == path[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!path[row][col]){
            return;
        }

        // i am considering in my path
        path[row][col] = false;

        //down
        if(row < path.length - 1){
            pathall(p + 'D',path,row + 1,col);
        }

        // right
        if(col <  path[0].length - 1){
            pathall(p + 'R',path,row,col + 1);
        }

        // up
        if(row > 0){
            pathall(p + 'U',path,row - 1,col);
        }

        // left

        if(col> 0){
            pathall(p + 'L',path,row,col - 1);
        }

        //this line is where the function will be over
        // before the function get removed also remove the changes that were made by that function
        path[row][col] = true;
    }

    public static void pathallstring(String p,boolean[][] maze,int row, int col,int[][] path,int step){
        path[row][col] = step;
        if(row == maze.length - 1 && col == maze[0].length - 1){
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[row][col]){
            return;
        }

        // i am considering in my path
        maze[row][col] = false;

        //down
        if(row < maze.length - 1){
            pathallstring(p + 'D',maze,row + 1,col,path,step + 1);
        }

        // right
        if(col <  maze[0].length - 1){
            pathallstring(p + 'R',maze,row,col + 1,path,step + 1);
        }

        // up
        if(row > 0){
            pathallstring(p + 'U',maze,row - 1,col,path,step + 1);
        }

        // left

        if(col> 0){
            pathallstring(p + 'L',maze,row,col - 1,path,step + 1);
        }

        //this line is where the function will be over
        // before the function get removed also remove the changes that were made by that function
        maze[row][col] = true;
        path[row][col] = 0;

    }
}
