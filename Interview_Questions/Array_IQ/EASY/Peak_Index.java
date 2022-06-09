// Peak Index in a Mountain Array:- https://leetcode.com/problems/peak-index-in-a-mountain-array/

package Interview_Questions.Array_IQ.EASY;

public class Peak_Index {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 4, 7, 2, 0 };
        int max = peakIndexInMountainArray(arr);
        System.out.println(max);
    }

    /*
     * In an mountain array :-
     * (1) The array from index 0 to largest index is sorted in ascending order and
     * (2) The array from largest index to ending index is sorted in descending
     * order.
     * (3) We can use binary search to get the largest index.
     */

    // Time Complexity = O(logn) & Space Complexity = O(1).
    static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;

        int start = 0, end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid; 
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
