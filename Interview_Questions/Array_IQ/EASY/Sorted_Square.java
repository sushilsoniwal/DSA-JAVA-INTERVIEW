// Squares of a Sorted Array:- https://leetcode.com/problems/squares-of-a-sorted-array/

package Interview_Questions.Array_IQ.EASY;

import java.util.Arrays;

public class Sorted_Square {
    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };
        int[] res = sortedSquares2(arr);
        System.out.println(Arrays.toString(res));
    }

    /*
     * BruteForce Approach.
     * (1) Square all the elements of array.
     * (2) Sort the squared array.
     * Time Complexity = O(n*logn) for sorting.
     * Space Complexity = O(1) no extra space is used.
     */

    static int[] sortedSquares1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    /*
     * Better Approach.
     * (1) Create new array & start filling it from behind.
     * (2) Make two pointers that points starting & ending index of original array
     * respectively.
     * Time Complexity = O(n) for traversing.
     * Space Complexity = O(n) extra space for answer array.
     */

    static int[] sortedSquares2(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0, end = nums.length - 1;

        int ansIdx = nums.length - 1;
        while (start <= end) {
            if (nums[start] * nums[start] > nums[end] * nums[end]) {
                ans[ansIdx--] = nums[start] * nums[start];
                start++;
            } else {
                ans[ansIdx--] = nums[end] * nums[end];
                end--;
            }
        }
        return ans;
    }
}
