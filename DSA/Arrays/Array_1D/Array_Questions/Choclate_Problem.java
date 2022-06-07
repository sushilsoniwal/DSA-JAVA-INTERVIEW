// Chocolate Distribution Problem:- https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1/#

package DSA.Arrays.Array_1D.Array_Questions;

import java.util.Arrays;

public class Choclate_Problem {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 2, 4, 9, 12, 56 };
        int n = 7;
        int m = 3;

        System.out.println(findMinDiff(arr, n, m));
    }

    // Time Complexity = O(n*logn) & Space Complexity = O(1).
    static long findMinDiff(int[] arr, int n, int m) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (n < m) {
            return -1;
        }

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min) {
                min = diff;
            }
        }
        return min;
    }
}
