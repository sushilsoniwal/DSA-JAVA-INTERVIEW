// Sqrt(x):- https://leetcode.com/problems/sqrtx/

package Interview_Questions.Array_IQ.EASY;

public class Square_Root {
    public static void main(String[] args) {
        int sq = mySqrt(8);
        System.out.println(sq);
    }

    // T.C = O(logx) & S.C = O(1).
    static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int start = 1;
        int end = x;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
