package DSA.Arrays.Array_1D.Array_Searching;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 22, 45, 54 };
        int key = 45;

        int index = search(arr, key);
        System.out.println(index);
    }

    /* Code For Binary Search :- T.C = O(LogN) & S.C = O(1) */
    static int search(int[] arr, int key) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
