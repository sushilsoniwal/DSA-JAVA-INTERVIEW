// Search in Rotated Sorted Array:- https://leetcode.com/problems/search-in-rotated-sorted-array/

package Interview_Questions.Array_IQ.MEDIUM;

public class RBS1 {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;
        int idx = search(arr, target);
        System.out.println(idx);
    }

    // T.C = O(logn) & S.C = O(1).
    static int search(int[] nums, int target) {
        int n = nums.length;
        int s = 0, e = n - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] == target) {
                return m;
            } else if (nums[s] <= nums[m]) {
                if (nums[s] <= target && nums[m] > target) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (nums[m] < target && nums[e] >= target) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }
}
