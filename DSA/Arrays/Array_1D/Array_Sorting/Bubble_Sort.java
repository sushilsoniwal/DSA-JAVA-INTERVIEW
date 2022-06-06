package DSA.Arrays.Array_1D.Array_Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 1, 2, 4 };
        int n = arr.length;

        bubble(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    /*
     * Bubble Sort:- Swap two adjacent elements if they are in wrong order.
     * Stable Sorting Algorithm (Order before sorting == Order after sorting).
     * Time Complexity => O(n^2) In worst case & O(n) in best case.
     * Space Complexity => O(1).
     */

    // Code For Bubble Sort.
    static void bubble(int[] arr, int n) {

        // Outer loop for no. of Passes.
        for (int i = 0; i < n - 1; i++) {
            // Flag variable to check swapping is happening or not.
            boolean flag = false;
            // Inner loop for comparisons and swapping.
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                flag = true;
            }
            // If Swapping was not done that means our array is already sorted, So we don't
            // need to check further.
            if (flag == false)
                break;
        }
    }
}
