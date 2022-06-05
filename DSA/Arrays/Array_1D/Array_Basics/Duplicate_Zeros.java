// Duplicate Zeros:- https://leetcode.com/problems/duplicate-zeros/

package DSA.Arrays.Array_1D.Array_Basics;

import java.util.Arrays;

public class Duplicate_Zeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Time Complexity = O(n^2) && Space Complexity = O(1);
    static void duplicateZeros(int[] arr) {
        int n = arr.length;

        if (arr == null || arr.length == 0) {
            return;
        }

        // Outer loop runs for n-1 times because we don't need to care about the zero
        // present at last index.
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                // Shift elements towards right.
                for (int j = n - 2; j >= i; j--) {
                    arr[j + 1] = arr[j];
                }
                // we don't want to traverse over the duplicate zero.
                i++;
            }
        }
    }
}
