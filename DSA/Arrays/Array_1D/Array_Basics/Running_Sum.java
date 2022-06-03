// Running Sum:- https://leetcode.com/problems/running-sum-of-1d-array/

package DSA.Arrays.Array_1D.Array_Basics;

import java.util.Arrays;

public class Running_Sum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] ans = runningSum2(arr);
        System.out.println(Arrays.toString(ans));
    }

    // T.C:- O(N) & S.C:- O(N);
    static int[] runningSum1(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = nums[0];
        for (int i = 1; i < n; i++) {
            ans[i] = nums[i] + ans[i - 1];
        }
        return ans;
    }

    // T.C:- O(N) & S.C:- O(1);
    static int[] runningSum2(int[] nums) {
        int i = 1;
        while (i < nums.length) {
            nums[i] += nums[i - 1];
            i++;
        }
        return nums;
    }
}
