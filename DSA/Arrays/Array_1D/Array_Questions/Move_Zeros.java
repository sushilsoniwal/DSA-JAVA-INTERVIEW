// Move Zeros:- https://leetcode.com/problems/move-zeroes/

package DSA.Arrays.Array_1D.Array_Questions;

import java.util.Arrays;

public class Move_Zeros {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 7, 9, 0, 0, 5 };
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Time Complexity = O(n) & Space Complexity = O(1).
    static void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}
