// Find the Duplicate Number:- https://leetcode.com/problems/find-the-duplicate-number/

package Interview_Questions.Array_IQ.MEDIUM;

public class Duplicate_Number {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 4, 2 };
        int dup = findDuplicate2(arr);
        System.out.println(dup);
    }

    // T.C = O(n) & S.C = O(1).
    static int findDuplicate1(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        int ans = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                ans = arr[i];
                break;
            }
        }
        return ans;
    }

    // T.C = O(n) & S.C = O(1).
    static int findDuplicate2(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
