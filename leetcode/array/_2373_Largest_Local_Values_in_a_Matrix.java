package array;

import java.util.Arrays;

public class _2373_Largest_Local_Values_in_a_Matrix {
    public static void main(String[] args) {
        int[][] grid = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        System.out.println(Arrays.deepToString(largestLocal(grid)));
    }

    // TODO: Chuaw lamf duojcw
    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n - 2][n - 2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }

        return ans;
    }

    private static int findMax(int[][] arr) {
        int n = arr.length;
        int max = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
