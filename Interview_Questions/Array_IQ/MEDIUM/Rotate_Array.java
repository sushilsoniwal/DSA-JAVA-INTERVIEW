// Rotate Array:- https://leetcode.com/problems/rotate-array/

package Interview_Questions.Array_IQ.MEDIUM;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotate3(arr, 4);
        System.out.println(Arrays.toString(arr));
    }

    // T.C = O(n*k) & S.C = O(1).
    static void rotate1(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            int lastVal = nums[n - 1];
            for (int j = n - 2; j >= 0; j--)
                nums[j + 1] = nums[j];
            nums[0] = lastVal;
        }
    }

    // T.C = O(n) & S.C = O(n).
    static void rotate2(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        // Copying elements from temp to original array.
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    // T.C = O(n) & S.C = O(1).
    static void rotate3(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
