package DSA.Arrays.Array_1D.Array_Searching;

/**
 * Linear_Search:- Traverse Entire Array Sequentially To Find The Target Value.
 */
public class Linear_Search {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 23, 14, 67, 54 };
        int key = 5;

        int index = search(arr, key);
        System.out.println(index);
    }

    /* Code For Linear Search :- T.C = O(N) & S.C = O(1) */
    static int search(int[] arr, int key) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }
}