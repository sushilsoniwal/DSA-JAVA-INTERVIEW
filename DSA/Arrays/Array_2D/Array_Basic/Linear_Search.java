package DSA.Arrays.Array_2D.Array_Basic;

public class Linear_Search {
    public static void main(String[] args) {
        int[][] mat = { { 23, 12, 45 }, { 23, 14, 51, 11, 77 }, { 2, 3 } };
        int key = 11;
        System.out.println(search(mat, key));
    }

    // Time Complexity = O(m*n) & Space Complexity = O(1).
    static boolean search(int[][] mat, int key) {
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                if (mat[row][col] == key) {
                    return true;
                }
            }
        }
        return false;
    }
}
