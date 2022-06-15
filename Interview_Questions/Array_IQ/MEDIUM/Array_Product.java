// Product of Array Except Self:- https://leetcode.com/problems/product-of-array-except-self/

package Interview_Questions.Array_IQ.MEDIUM;

import java.util.Arrays;

public class Array_Product {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] ans = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }

    // T.C = O(n) & S.C = O(1).
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
