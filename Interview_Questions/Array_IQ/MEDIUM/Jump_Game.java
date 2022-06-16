// Jump Game:- https://leetcode.com/problems/jump-game/

package Interview_Questions.Array_IQ.MEDIUM;

public class Jump_Game {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 1, 4 };
        System.out.println(canJump(arr));
    }

    // T.C = O(n) & S.C = O(1).
    static boolean canJump(int[] nums) {
        int n = nums.length;
        int reach = 0;
        for (int i = 0; i < n; i++) {
            if (reach < i) {
                return false;
            }
            reach = Math.max(reach, i + nums[i]);
        }
        return true;
    }
}
