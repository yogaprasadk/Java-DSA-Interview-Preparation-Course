package Basicoperations;
public class rotate {
    public static void main(String[] args) {
        /*
        1 2 3                                           7 4 1
        4 5 6 ==> rotate 90 or clockwise ==> output ==> 8 5 2
        7 8 9                                           9 6 3
         */

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        //clockwise
        rotate90degreeorclockwise(arr);
        rotatematrixby180degree(arr);
        rotatematrixby270degree(arr);
        rotatematrixby360degree(arr);

        // anticlockwise
        rotateminus90degreeoranticlockwise(arr);
        rotateanticlockwisematrixby180degree(arr);
        rotateanticlockwisematrixby270degree(arr);
        rotateanticlockwisematrixby360degree(arr);
         /*
        1 2 3                                                3 6 9
        4 5 6 ==> rotate -90 or anticlockwise ==> output ==> 2 5 8
        7 8 9                                                1 4 7
         */
    }

    static void rotate90degreeorclockwise(int[][] arr){
        // to rotate 90 degree or clockwise direction
        // step1: transpose of a matrix
        transposematrix(arr);
        System.out.println();
        // step2: reverse the transpose of a matrix
        reversematrix(arr);
        System.out.println();
        // step3: display matrix
        displaymatrix(arr);
    }

    static void transposematrix(int[][] arr){
          // with creating an extra space
        /*
        int[][] matrix = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                matrix[j][i] = arr[i][j];
            }
        }
        */
        //or without creating an array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Transpose:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    // when reversing, reverse row in clockwise
    static void reversematrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1;
            for (int j = 0; j < arr.length/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][last];
                arr[i][last] = temp;
                last--;
            }
        }
        System.out.println("Reverse:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void displaymatrix(int[][] arr){
        System.out.println("Output");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void rotatematrixby180degree(int[][] arr){
        //transpose
        transposematrix(arr);
        //reverse
        reversematrix(arr);
        //transpose
        transposematrix(arr);
        //reverse
        reversematrix(arr);
        //display
        displaymatrix(arr);
    }

    static void rotatematrixby270degree(int[][] arr){
        //transpose
        transposematrix(arr);
        //reverse
        reversematrix(arr);
        //transpose
        transposematrix(arr);
        //reverse
        reversematrix(arr);
        //transpose
        transposematrix(arr);
        //reverse
        reversematrix(arr);
        //display
        displaymatrix(arr);
    }

    static void rotatematrixby360degree(int[][] arr){
        //transpose
        transposematrix(arr);
        //reverse
        reversematrix(arr);
        //transpose
        transposematrix(arr);
        //reverse
        reversematrix(arr);
        //transpose
        transposematrix(arr);
        //reverse
        reversematrix(arr);
        //transpose
        transposematrix(arr);
        //reverse
        reversematrix(arr);
        //display
        displaymatrix(arr);
    }

    static void rotateminus90degreeoranticlockwise(int[][] arr){
        anticlockwisetransposematrix(arr);
        anticlockwisereversematrix(arr);
    }

    static void anticlockwisetransposematrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("Transpose:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void anticlockwisereversematrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1;
            for (int j = 0; j < arr.length/2; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[last][i];
                arr[last][i] = temp;
                last--;
            }
        }
        System.out.println("Reverse:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void rotateanticlockwisematrixby180degree(int[][] arr){
        //transpose
        anticlockwisetransposematrix(arr);
        //reverse
        anticlockwisereversematrix(arr);
        //transpose
        anticlockwisetransposematrix(arr);
        //reverse
        anticlockwisereversematrix(arr);
        //display
        displaymatrix(arr);
    }

    static void rotateanticlockwisematrixby270degree(int[][] arr){
        //transpose
        anticlockwisetransposematrix(arr);
        //reverse
        anticlockwisereversematrix(arr);
        //transpose
        anticlockwisetransposematrix(arr);
        //reverse
        anticlockwisereversematrix(arr);
        //transpose
        anticlockwisetransposematrix(arr);
        //reverse
        anticlockwisereversematrix(arr);
        //display
        displaymatrix(arr);
    }
    static void rotateanticlockwisematrixby360degree(int[][] arr){
        //transpose
        anticlockwisetransposematrix(arr);
        //reverse
        anticlockwisereversematrix(arr);
        //transpose
        anticlockwisetransposematrix(arr);
        //reverse
        anticlockwisereversematrix(arr);
        //transpose
        anticlockwisetransposematrix(arr);
        //reverse
        anticlockwisereversematrix(arr);
        //transpose
        anticlockwisetransposematrix(arr);
        //reverse
        anticlockwisereversematrix(arr);
        //display
        displaymatrix(arr);
    }
}
