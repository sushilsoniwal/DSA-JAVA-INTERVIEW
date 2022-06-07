// Find N Unique Integers Sum up to Zero:- https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

package DSA.Arrays.Array_1D.Array_Questions;

import java.util.Arrays;

public class Sum_Zero {
    public static void main(String[] args) {
        int[] ans = sumZero2(5);
        System.out.println(Arrays.toString(ans));
    }

    // Fill from both the sides.
    static int[] sumZero1(int n) {
        int[] res = new int[n];
        int left = 0, right = n - 1, start = 1;
        while (left < right) {
            res[left++] = start;
            res[right--] = -start;
            start++;
        }
        return res;
    }

    // Using An Observation.
    static int[] sumZero2(int n) {
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i)
            ans[i] = (i * 2 - n + 1);
        return ans;
    }
}
