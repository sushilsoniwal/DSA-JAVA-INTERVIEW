package DSA.Arrays.Array_1D.Array_Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Array Declaration And Initialization.
         * (1) Syntax:- data_type[] array_name = new data_type[size];
         * (2) Syntax:- data_type[] array_name = {x,y,z};
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of your array:- ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of your array till entered size:-");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Your Array Is:-");
        System.out.println(Arrays.toString(arr));

        in.close();
    }
}
