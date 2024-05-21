import java.util.Arrays;

public class BubbleSort {
    /*
     * Nguyên lý:
     * - Chạy từ đầu đến cuối mảng
     * - Nếu phần tử đứng trước > phần tử đứng sau -> đổi chỗ
     * - Sau mỗi vòng lặp thì phần tử lớn nhất sẽ trôi xuống dưới
     * */
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 9, 3};
        System.out.println(Arrays.toString(bubbleSort1(arr)));
    }

    public static void printArray(int index, int[] arr) {
        System.out.printf("Index = %d -> ", index);
        System.out.println(Arrays.toString(arr));
    }

    // Normal
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            printArray(i, arr);
        }

        return arr;
    }

    // Refactor
    // Nếu trường hợp đổi chỗ không xảy ra -> Mảng đã được sắp xếp -> Break
    public static int[] bubbleSort1(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            printArray(i, arr);

            if(!isSorted) {
                break;
            }
        }

        return arr;
    }
}
