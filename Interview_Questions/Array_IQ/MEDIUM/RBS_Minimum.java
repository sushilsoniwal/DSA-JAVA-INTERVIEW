// Find Minimum in Rotated Sorted Array:- https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

package Interview_Questions.Array_IQ.MEDIUM;

public class RBS_Minimum {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 0, 1, 2 };
        System.out.println(findMin(nums));
    }

    // T.C = O(logn) & S.C = O(1).
    static int findMin(int[] nums) {
        int s = 0, e = nums.length - 1, m, ans = Integer.MAX_VALUE;
        if (nums[0] < nums[e] || nums.length == 1) {
            return nums[0];
        }
        while (s <= e) {
            m = s + (e - s) / 2;
            if (nums[m] >= nums[0]) {
                s = m + 1;
            } else {
                ans = Math.min(ans, nums[m]);
                e = m - 1;
            }
        }
        return ans;
    }
}
