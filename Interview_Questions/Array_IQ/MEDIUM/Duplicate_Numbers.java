// Find All Duplicates in an Array:- https://leetcode.com/problems/find-all-duplicates-in-an-array/

package Interview_Questions.Array_IQ.MEDIUM;

import java.util.ArrayList;
import java.util.List;

public class Duplicate_Numbers {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> res = findDuplicates(arr);
        System.out.println(res);
    }

    // T.C = O(n) & S.C = O(n).
    static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]);
            }
        }
        return ans;
    }
}
