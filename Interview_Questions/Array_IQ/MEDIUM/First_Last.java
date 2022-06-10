// Find First and Last Position of Element in Sorted Array:- https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package Interview_Questions.Array_IQ.MEDIUM;

import java.util.Arrays;

public class First_Last {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 8, 8, 10 };
        int target = 7;
        int[] sol = searchRange(arr, target);
        System.out.println(Arrays.toString(sol));
    }

    // T.C = O(logn) & S.C = O(n).
    static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int pos = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                if (isFirst) {
                    pos = mid;
                    end = mid - 1;
                } else {
                    pos = mid;
                    start = mid + 1;
                }
            }
        }
        return pos;
    }
}
