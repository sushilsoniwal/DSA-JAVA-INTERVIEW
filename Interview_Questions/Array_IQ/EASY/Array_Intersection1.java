package Interview_Questions.Array_IQ.EASY;

import java.util.Arrays;
import java.util.LinkedList;

public class Array_Intersection1 {
    public static void main(String[] args) {
        int[] arr1 = { 4, 9, 5 };
        int[] arr2 = { 9, 4, 9, 8, 4 };
        int[] res = intersection(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }

    // T.C = O(nlogn) & S.C = O(n).
    static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        LinkedList<Integer> list = new LinkedList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {

                if (!list.contains(nums1[i])) {
                    list.add(nums1[i]);
                }

                i++;
                j++;

            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[list.size()];
        int idx = 0;
        for (int value : list)
            result[idx++] = value;
        return result;
    }
}
