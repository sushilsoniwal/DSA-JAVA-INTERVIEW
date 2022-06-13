// First Missing Positive:- https://leetcode.com/problems/first-missing-positive/

package Interview_Questions.Array_IQ.MEDIUM;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 11, 12 };
        System.out.println(firstMissingPositive(arr));
    }

    // T.C = O(n) & S.C = O(1).
    static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1)
                return j + 1;
        }
        return n + 1;
    }
}
