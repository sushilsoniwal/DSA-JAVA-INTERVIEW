// Sort Array By Parity:- https://leetcode.com/problems/sort-array-by-parity/

package Interview_Questions.Array_IQ.EASY;

import java.util.Arrays;

public class Sort_Parity {
    public static void main(String[] args) {
        int[] arr = { 14, 4, 6, 7 };
        int[] ans = sortArrayByParity(arr);
        System.out.println(Arrays.toString(ans));
    }

    // T.C = O(n) & S.C = O(1).
    static int[] sortArrayByParity(int[] arr) {
        int n = arr.length;
        int s = 0, e = n - 1;
        while (s < e) {
            if (arr[s] % 2 == 0 && arr[e] % 2 == 0) {
                s++;
            } else if (arr[s] % 2 != 0 && arr[e] % 2 != 0) {
                e--;
            } else if (arr[s] % 2 == 0 && arr[e] % 2 != 0) {
                s++;
                e--;
            } else {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        return arr;
    }
}
