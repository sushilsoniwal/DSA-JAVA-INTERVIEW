// Valid Mountain Array:- https://leetcode.com/problems/valid-mountain-array/

package Interview_Questions.Array_IQ.EASY;

public class Valid_Mountain {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 4, 5, 2, 1, 0 };
        System.out.println(validMountainArray(arr));
    }

    // Time Complexity = O(n) & Space Complexity = O(1).
    static boolean validMountainArray(int[] arr) {
        int n = arr.length;

        // For a mountain array length of array should by greater than or equal to 3.
        if (n < 3) {
            return false;
        }

        // Creating Two Pointers.
        int start = 0, end = n - 1;

        while (start < end) {
            if (arr[start + 1] > arr[start]) { // Ascending part of the array.
                start++;
            } else if (arr[end - 1] > arr[end]) { // Descending part of the array.
                end--;
            } else {
                break;
            }
        }
        return (start != 0 && end != n - 1 && start == end);
    }
}
