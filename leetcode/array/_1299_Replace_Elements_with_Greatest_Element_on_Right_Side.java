package array;

import java.util.Arrays;

public class _1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };

        System.out.println(Arrays.toString(replaceElements2(arr)));
        System.out.println("DONE");
    }

    // Input: arr = [17,18,5,4,6,1]
    // Output: [18,6,6,6,1,-1]
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        // Duyệt từ cuối mảng để tìm số lớn nhất
        for (int i = n - 1; i >= 0; i--) {
            if (i != n - 1) {
                arr[i] = Math.max(arr[i], arr[i + 1]);
            }
        }

        // Duyệt mảng để thay đổi vị trí
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        if (n > 0) {
            arr[n - 1] = -1;
        }

        return arr;
    }

    public static int[] replaceElements2(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                arr[i] = findMax(arr, i + 1);
            } else {
                arr[i] = -1;
            }
        }

        return arr;
    }

    private static int findMax(int[] arr, int i) {
        int n = arr.length;
        int max = arr[i];
        for (int j = i + 1; j < n; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }
        return max;
    }
}
