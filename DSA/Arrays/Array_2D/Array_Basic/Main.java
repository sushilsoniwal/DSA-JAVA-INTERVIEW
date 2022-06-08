package DSA.Arrays.Array_2D.Array_Basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Matrix Declaration And Initialization.
         * (1) Syntax:- data_type[][] array_name = new data_type[row_size][col_size];
         * (2) Syntax:- data_type[][] array_name = {{1,2,3},{4,5,6},{7,8}};
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows of your array:- ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns of your array:- ");
        int n = in.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Enter the elements of your array till entered size:-");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        System.out.println("Your Matrix Is:-");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}

/*
 * => A multidimensional array is an array of arrays. Each element of a
 * multidimensional array is an array itself.
 */
