// Duplicate Zeros:- https://leetcode.com/problems/duplicate-zeros/

package Interview_Questions.Array_IQ.EASY;

import java.util.Arrays;

public class Duplicate_Zeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros2(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
     * Naive Approach:-
     * (1) Traverse array till length-1.
     * (2) If the element where you current at is zero then shift all the elements
     * including zero to one step ahead.
     * (3) Don't forget increment the pointer by 1 else array will filled by 0s.
     * Time Complexity = O(n^2) for traversing & shifting.
     * Space Complexity = 0(1).
     */

    static void duplicateZeros1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // Traversing the array.
            if (arr[i] == 0) {
                for (int j = n - 2; j >= i; j--) {
                    arr[j + 1] = arr[j]; // Shifting The elements
                }
                i++; // incrementing i by 1
            }
        }
    }

    /*
     * Better Approach:-
     * (1) Calculate the number of zeros in array.
     * (2) Create two pointers one is pointing to length-1 & other is pointing to
     * length+zeros-1.
     * (3) Start modifying array from back.
     * Time Complexity = O(n).
     * Space Complexity = 0(1).
     */

    static void duplicateZeros2(int[] arr) {
        int n = arr.length, count = 0;

        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }
        int i = n - 1;
        int j = n + count - 1;

        while (i >= 0 && j >= 0) {
            if (arr[i] != 0) {
                if (j < n) {
                    arr[j] = arr[i];
                }
            } else {
                if (j < n) {
                    arr[j] = arr[i];
                }
                j--;
                if (j < n) {
                    arr[j] = arr[i];
                }
            }
            i--;
            j--;
        }
    }

}
