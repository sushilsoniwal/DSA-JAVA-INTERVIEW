// Remove Duplicates from Sorted Array:- https://leetcode.com/problems/remove-duplicates-from-sorted-array/

package DSA.Arrays.Array_1D.Array_Questions;

public class Remove_Duplicates {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(arr));
    }

    // Time Complexity = O(n) & Space Complexity = O(1).
    static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
