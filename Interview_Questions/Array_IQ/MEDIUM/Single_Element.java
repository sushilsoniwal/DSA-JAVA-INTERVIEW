// Single Element in a Sorted Array:- https://leetcode.com/problems/single-element-in-a-sorted-array/

package Interview_Questions.Array_IQ.MEDIUM;

public class Single_Element {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 7, 7, 10, 11, 11 };
        int res = singleNonDuplicate(arr);
        System.out.println(res);
    }

    static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        // Case-01 => Only one element in the array.
        if (n == 1) {
            return nums[0];
        }

        // Case-02 => If the first element is the element that appears once only.
        if (nums[start] != nums[start + 1]) {
            return nums[start];
        }

        // Case-03 => If the last element is the element that appears once only.
        if (nums[end] != nums[end - 1]) {
            return nums[end];
        }

        // Binary Search.
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case-01 => If the mid element is the element that appear once only.
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            } else if (mid % 2 == 0 && nums[mid] == nums[mid + 1] || mid % 2 != 0 && nums[mid] == nums[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
