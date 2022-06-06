package DSA.Arrays.Array_1D.Array_Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {

    }

    /*
     * Insertion Sort:- Pick an element from unsorted array and place it at its
     * corresponding position and shift the elements accordingly.
     * Stable Sorting Algorithm.
     * Time Complexity:- O(n^2) worst case.
     * Space Complexity:- O(1).
     */

    // Code For Insertion Sort.
    static void insertion(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            // Check for right index.
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current; // Swap with right index.
        }
    }
}
