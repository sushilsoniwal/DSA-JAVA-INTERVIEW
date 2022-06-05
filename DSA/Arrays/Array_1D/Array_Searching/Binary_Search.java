package DSA.Arrays.Array_1D.Array_Searching;

public class Binary_Search {
    public static void main(String[] args) {

        /*
         * int[] arr = { 2, 4, 5, 22, 45, 54 };
         * int index = ABS(arr, key);
         * System.out.println(index);
         */

        int[] arr = { 54, 45, 22, 5, 4, 2 };
        int key = 45;

        // int index = DBS(arr, key);
        int index = OABS(arr, key);
        System.out.println(index);
    }

    /* Code For Ascending Binary Search :- T.C = O(LogN) & S.C = O(1) */
    static int ABS(int[] arr, int key) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
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

    /* Code For Descending Binary Search :- T.C = O(LogN) & S.C = O(1) */
    static int DBS(int[] arr, int key) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    /* Code For Order Agnostic Binary Search :- T.C = O(LogN) & S.C = O(1) */
    static int OABS(int[] arr, int key) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            // Array sorted in decreasing order.
            else if (arr[start] > arr[end]) {
                if (arr[mid] > key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            // Array is in ascending order
            else {
                if (arr[mid] > key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
