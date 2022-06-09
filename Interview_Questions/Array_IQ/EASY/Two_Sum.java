// Two Sum:- https://leetcode.com/problems/two-sum/

package Interview_Questions.Array_IQ.EASY;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = twoSum2(arr, target);
        System.out.println(Arrays.toString(res));
    }

    /*
     * Naive Approach:-
     * (1) Run two nested for-loops.
     * (2) Keep checking for target sum.
     * Time Complexity = O(n^2), for two nested loops.
     * Space Complexity = O(n).
     */

    static int[] twoSum1(int[] arr, int target) {
        int n = arr.length;
        int[] ans = { -1, -1 };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    /*
     * Optimal Approach:-
     * (1) We can make a hashmap of integers.
     * (2) Run a for loop to traverse all the elements of array.
     * (3) Keep checking for target sum.
     * Time Complexity = O(n).
     * Space Complexity = O(n).
     */

    static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int b = nums[i], a = target - b;
            if (hm.containsKey(a)) {
                return new int[] { hm.get(a), i };
            }
            hm.put(b, i);
        }
        return new int[] {};
    }
}
