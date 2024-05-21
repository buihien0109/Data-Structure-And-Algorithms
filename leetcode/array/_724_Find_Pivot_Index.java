package array;

public class _724_Find_Pivot_Index {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            return 0;
        }

        if (n == 0) {
            return -1;
        }

        int total = 0;
        for (int value : arr) {
            total += value;
        }

        int totalLeft = 0;
        for (int i = 0; i < n; i++) {
            int totalRight = total - totalLeft - arr[i];
            if (totalLeft == totalRight) {
                return i;
            }
            totalLeft += arr[i];
        }

        return -1;
    }

    // Với mỗi phần tử được xét -> Tính tổng trái + phải rồi so sánh
    public static int pivotIndex1(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            return 0;
        }

        for (int i = 0; i < n; i++) {
            int totalLeft = 0;
            int totalRight = 0;

            if (i == 0) {
                totalLeft = 0;
            } else {
                for (int j = 0; j < i; j++) {
                    totalLeft += arr[j];
                }
            }

            if (i == n - 1) {
                totalRight = 0;
            } else {
                for (int j = i + 1; j < n; j++) {
                    totalRight += arr[j];
                }
            }

            if (totalLeft == totalRight) {
                return i;
            }
        }
        return -1;
    }
}
