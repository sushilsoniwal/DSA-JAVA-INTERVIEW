// Sort Colors:- https://leetcode.com/problems/sort-colors/

package Interview_Questions.Array_IQ.MEDIUM;

import java.util.Arrays;

public class Sort_Color {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sortColors2(arr);
        System.out.println(Arrays.toString(arr));
    }

    // T.C = O(n) & S.C = O(1).
    static void sortColors(int[] nums) {
        int n = nums.length;
        int c0 = 0, c1 = 0;
        for (int i : nums) {
            if (i == 0) {
                c0++;
            } else if (i == 1) {
                c1++;
            } else {
            }
        }

        for (int i = 0; i < n; i++) {
            if (c0 > 0) {
                nums[i] = 0;
                c0--;
            } else if (c1 > 0) {
                nums[i] = 1;
                c1--;
            } else {
                nums[i] = 2;
            }
        }
    }

    // T.C = O(n) & S.C = O(1).
    static void sortColors2(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1, mid = 0, temp;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;

                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
