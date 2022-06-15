// Maximum Subarray:- https://leetcode.com/problems/maximum-subarray/

package Interview_Questions.Array_IQ.EASY;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray3(arr));
    }

    /*
     * BruteForce Approach:- Using 3 loops.
     * Time Complexity = O(n^3).
     * Space Complexity = O(1).
     */

    static int maxSubArray1(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    /*
     * Better Approach:- Using 2 loops.
     * Time Complexity = O(n^2).
     * Space Complexity = O(1).
     */

    static int maxSubArray2(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    /*
     * Dynamic Programming:- Kadane's Algorithm.
     * (1) Declare and initialize currentSum and maxSum 0.
     * (2) Iterate the array and add each element to currentSum.
     * (3) If at any point, currentSum becomes negative, reassign it to 0.
     * (4) Keep on updating maxSum with maximum values of currentSum.
     * (5) Return maxSum.
     * Time Complexity = O(n).
     * Space Complexity = O(1).
     */

    static int maxSubArray3(int[] nums) {
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
