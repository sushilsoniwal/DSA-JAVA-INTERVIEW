// Squares of a Sorted Array:- https://leetcode.com/problems/squares-of-a-sorted-array/

package DSA.Arrays.Array_1D.Array_Basics;

import java.util.Arrays;

public class Square {
    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };
        int[] ans = sortedSquares2(arr);
        System.out.println(Arrays.toString(ans));
    }

    /* BruteForce Approach:- T.C = O(NLogN) & S.C = O(N) */
    static int[] sortedSquares1(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i] * nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }

    /* Better Approach:- T.C = O(N) & S.C = O(N) */
    static int[] sortedSquares2(int[] A) {
        int[] res = new int[A.length];
        int start = 0, end = A.length - 1;
        int resIndex = A.length - 1;

        while (start <= end) {
            if (A[start] * A[start] > A[end] * A[end]) {
                res[resIndex--] = A[start] * A[start];
                start++;
            } else {
                res[resIndex--] = A[end] * A[end];
                end--;
            }
        }
        return res;
    }
}
