package DSA.Arrays.Array_1D.Array_Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 1, 2, 5, 4 };
        int n = arr.length;

        selection(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    /*
     * Selection Sort:- Take minimum element from unsorted array & place it at the begining.
     * Not A Stable Sorting Algorithm (Order before sorting != Order after sorting).
     * Time Complexity => O(n^2) In worst & best case.
     * Space Complexity => O(1).
     */

    // Code For Bubble Sort.
    static void selection(int[] arr, int n) {

        // Outer loop for passes.
        for (int i = 0; i < n - 1; i++) {
            // Initialize minimum as first index of array.
            int min = i;
            // Inner loop for comparisons.
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j; // Update minimum index.
                }
            }

            // Swap minimum with first index.
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
