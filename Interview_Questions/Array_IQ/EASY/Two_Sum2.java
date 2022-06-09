// Two Sum II - Input Array Is Sorted:- https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

package Interview_Questions.Array_IQ.EASY;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum2 {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = twoSum2(arr, target);
        System.out.println(Arrays.toString(res));
    }

    /*
     * Naive Approach:-
     * (1) We can make a hashmap of integers.
     * (2) Run a for loop to traverse all the elements of array.
     * (3) Keep checking for target sum.
     * (4) Return the indexes as (i+1,j+1).
     * Time Complexity = O(n).
     * Space Complexity = O(n).
     */

    static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int b = nums[i], a = target - b;
            if (hm.containsKey(a)) {
                return new int[] { hm.get(a) + 1, i + 1 };
            }
            hm.put(b, i);
        }
        return new int[] {};
    }

    /*
     * Optimal Approach:-
     * (1) We can make two pointers and initialized with starting & ending index of
     * given sorted array..
     * (2) Run a while loop to traverse all the elements of array.
     * (3) Shrink the scope based on the value and target comparison.
     * (4) Return the indexes as (s+1,e+1).
     * Time Complexity = O(n).
     * Space Complexity = O(n).
     */

    static int[] twoSum2(int[] nums, int target) {
        int[] ans;
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int m = nums[s] + nums[e];
            if (m == target) {
                return new int[] { s + 1, e + 1 };
            } else if (m > target) {
                e--;
            } else {
                s++;
            }
        }
        return new int[] { -1, -1 };
    }
}
