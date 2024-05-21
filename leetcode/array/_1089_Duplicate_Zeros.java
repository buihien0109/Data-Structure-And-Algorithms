package array;

import java.util.Arrays;

public class _1089_Duplicate_Zeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 0, 5, 0 };
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("DONE");
    }

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = n - 2; j >= i + 1; j--) {
                    arr[j + 1] = arr[j];
                }

                if (i < n - 1) {
                    arr[i + 1] = 0;
                    i++;
                }
            }
        }
    }
}
