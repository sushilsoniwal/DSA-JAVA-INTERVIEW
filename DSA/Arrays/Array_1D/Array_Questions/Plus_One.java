// Plus One:- https://leetcode.com/problems/plus-one/

package DSA.Arrays.Array_1D.Array_Questions;

import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 4 };
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] plusOne(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 9) {
                nums[i]++;
                break;
            } else {
                nums[i] = 0;
            }
        }
        if (nums[0] == 0) {
            int[] ans = new int[nums.length + 1];
            ans[0] = 1;
            return ans;
        }
        return nums;
    }
}
