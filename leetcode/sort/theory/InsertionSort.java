import java.util.Arrays;

/*
 * Nguyên lý:
 * - Chạy từ đầu đến cuối mảng
 * - Tại vòng lặp i -> coi như dãy từ 0 -> i - 1 đã được sắp xếp -> chèn phần tử a[i] vào vị trí thích hợp
 * - Sau vòng lặp thứ i -> dãy [0 -> i] đã được sắp xếp
 * */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 9, 3};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static void printArray(int index, int[] arr) {
        System.out.printf("Index = %d -> ", index);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int ai = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > ai) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = ai;

            printArray(i, arr);
        }
        return arr;
    }
}
