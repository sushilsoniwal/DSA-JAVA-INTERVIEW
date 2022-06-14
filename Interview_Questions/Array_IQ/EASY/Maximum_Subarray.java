// Maximum Subarray:- https://leetcode.com/problems/maximum-subarray/

package Interview_Questions.Array_IQ.EASY;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(arr));
    }

    // T.C = O(n) & S.C = O(1).
    static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
