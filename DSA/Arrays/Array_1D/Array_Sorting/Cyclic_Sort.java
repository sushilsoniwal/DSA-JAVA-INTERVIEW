package DSA.Arrays.Array_1D.Array_Sorting;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 1, 4, 2 };
        int n = arr.length;

        cyclic0(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    /*
     * Cyclic Sort:- Swap the element with their correct position.
     * Not a stable algorithm.
     * Time Complexity:- O(n).
     * Space Complexity:- O(1).
     */

    // Code For Cyclic Sort For Range [0 - N].
    static void cyclic0(int[] arr, int n) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }

    // Code For Cyclic Sort For Range [1 - N].
    static void cyclic1(int[] arr, int n) {
        int i = 0;
        while (i < n) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
    }

}
