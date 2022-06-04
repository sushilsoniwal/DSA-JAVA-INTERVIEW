// Number Of Good Pairs:- https://leetcode.com/problems/number-of-good-pairs/

package DSA.Arrays.Array_1D.Array_Basics;

public class Number_Of_Good_Pairs {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 5, 1, 3, 1 };
        int ans = numIdenticalPairs(arr);
        System.out.println(ans);
    }

    // T.C:- O(N^2) & S.C:- O(1).
    static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i < j && nums[i] == nums[j]) {
                    c++;
                }
            }
        }
        return c;
    }
}
