package DSA.Arrays.Array_1D.Array_Basics;

public class Array_Sum {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 6, 5, 9 };
        System.out.println(arraySum(arr));
    }

    // Method to calculate the sum of all the elements in an array.
    static int arraySum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    /*
     * Time Complexity:- O(N);
     * Space Complexity:- O(1);
     */
}
