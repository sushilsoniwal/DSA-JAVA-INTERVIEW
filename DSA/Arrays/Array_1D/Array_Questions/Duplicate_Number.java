// Find the Duplicate Number:- https://leetcode.com/problems/find-the-duplicate-number/

package DSA.Arrays.Array_1D.Array_Questions;

public class Duplicate_Number {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(arr));
    }

    // Time Complexity = O(n) & Space Complexity = O(1).
    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
