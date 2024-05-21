import java.util.Arrays;

/*
 * Nguyên lý:
 * - Chạy từ đầu đến cuối mảng
 * - Tại vòng lặp i -> tìm phần tử nhỏ nhất trong đoạn [i + 1, n - 1]. Nếu phần tử nào < a[i] -> ĐỔI CHỖ
 * - Sau vòng lặp thứ i -> dãy [0 -> i] đã được sắp xếp
 * */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 9, 3};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static void printArray(int index, int[] arr) {
        System.out.printf("Index = %d -> ", index);
        System.out.println(Arrays.toString(arr));
    }

    // Normal
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if(minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            printArray(i, arr);
        }

        return arr;
    }
}
