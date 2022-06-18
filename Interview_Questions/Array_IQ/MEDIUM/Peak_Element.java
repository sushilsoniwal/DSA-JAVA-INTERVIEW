package Interview_Questions.Array_IQ.MEDIUM;

public class Peak_Element {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        System.out.println(findPeakElement(arr));
    }

    // T.C = O(logn) & S.C = O(1).
    static int findPeakElement(int[] nums) {
        int s = 0, e = nums.length - 1, m;
        while (s < e) {
            m = s + (e - s) / 2;
            if (nums[m] > nums[m + 1])
                e = m;
            else
                s = m + 1;
        }
        return s;
    }
}
