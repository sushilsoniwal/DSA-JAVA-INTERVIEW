// Check if n and its double exists:- https://leetcode.com/problems/check-if-n-and-its-double-exist/

package Interview_Questions.Array_IQ.EASY;

import java.util.Arrays;
import java.util.HashSet;

public class Exists_Double {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 5, 3 };
        System.out.println(checkIfExist(arr));
    }

    /*
     * Naive Approach = Two Loops.
     * Time Complexity = O(n^2) & Space Complexity = O(1).
     */

    static boolean checkIfExist1(int[] arr) {

        boolean b = false;
        int i = 0;
        while (i < arr.length) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    b = true;
                }
            }
            i++;
        }
        return b;
    }

    /*
     * Better Approach = Binary Search
     * Time Complexity = O(nlogn) & Space Complexity = O(n).
     */

    static boolean checkIfExist2(int[] arr) {
        int n = arr.length;

        // Sort the array.
        Arrays.sort(arr);

        int ans;

        // For Loop To Traverse The Array.
        for (int i = 0; i < n; i++) {
            ans = check(arr, arr[i] * 2); // Check For double.

            if (ans != i && ans != -1) {
                return true;
            }
        }

        return false; // No Double Exists.
    }

    // Binary Search To Find The double.
    private static int check(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    /*
     * Optimal Approach = Hashset.
     * Time Complexity = O(n) & Space Complexity = O(1).
     */

    static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int a : arr) {
            if (set.contains(a * 2) || (a % 2 == 0 && set.contains(a / 2))) {
                return true;
            }
            set.add(a);
        }
        return false;
    }
}
