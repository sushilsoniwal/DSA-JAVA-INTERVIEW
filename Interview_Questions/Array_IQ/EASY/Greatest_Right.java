// Replace Elements with Greatest Element on Right Side:- https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

package Interview_Questions.Array_IQ.EASY;

import java.util.Arrays;

public class Greatest_Right {
    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        int[] res = replaceElements2(arr);
        System.out.println(Arrays.toString(res));
    }

    // T.C = O(n^2) & S.C = O(1).
    static int[] replaceElements1(int[] arr) {
        int n = arr.length;
        int max = -1;

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (j < n) {
                if (arr[j] > max) {
                    max = arr[j];
                }
                j++;
            }
            arr[i] = max;
            max = -1;
        }

        return arr;
    }

    // T.C = O(n) & S.C = O(1).
    static int[] replaceElements2(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; --i) {
            int tmp = arr[i];
            arr[i] = max;
            max = Math.max(max, tmp);
        }
        return arr;
    }
}
