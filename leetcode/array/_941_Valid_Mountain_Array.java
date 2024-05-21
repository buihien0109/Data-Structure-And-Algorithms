package array;

public class _941_Valid_Mountain_Array {
    public static void main(String[] args) {
        int[] arr2 = { 0, 1, 2, 4, 2, 1 };
        // System.out.println(validMountainArray(arr));
        // System.out.println(validMountainArray(arr1));
        System.out.println(validMountainArray(arr2));
    }

    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;

        if (n < 3) {
            return false;
        }

        // Kiểm tra dãy tăng đến khi nào gặp trường hợp giảm thì dừng lại
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Nếu i là phần tử đầu tiên hoặc cuối cùng trong mảng thì không hợp lệ
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Kiểm tra dãy giảm đến khi nào gặp trường hợp tăng thì dừng lại
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        // Nếu i là phần tử cuối cùng -> true, ngược lại false
        if (i == n - 1) {
            return true;
        }

        return false;
    }

    public static boolean validMountainArray1(int[] arr) {
        int n = arr.length;
        boolean isIncrement = true;

        // Cần ít nhất 3 phần tử trong dãy để xét
        if (n < 3) {
            return false;
        }

        for (int i = 0; i < n - 1; i++) {
            int j = i + 1; // j là phần tử đứng sau i

            if (arr[i] > arr[j]) { // Dãy giảm
                if (isIncrement == false) {
                    // Dãy đang giảm và isIncrement = false là bình thường
                } else {
                    // Nếu phần tử đầu tiên > phần tử thứ 2 --> dãy giảm. Mà ban đầu dãy cần tăng
                    if (i == 0) {
                        return false;
                    }
                    isIncrement = false;
                }

            } else if (arr[i] < arr[j]) { // Dãy tăng
                if (isIncrement == true) {
                    // Dãy đang giảm và isIncrement = true là bình thường
                } else {
                    // Dãy đang giảm và isIncrement = false tức là dãy đã giảm trước đó giờ lại tăng
                    // lên
                    return false;
                }
            } else {
                return false;
            }
        }

        if (isIncrement == false) {
            return true;
        }

        return false;
    }

    public static boolean validMountainArray2(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return false;
        }

        int maxIndex = findMax(arr);
        if (maxIndex == 0 || maxIndex == n - 1) {
            return false;
        }

        for (int i = 0; i < maxIndex; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }

        for (int i = n - 1; i > maxIndex; i--) {
            if (arr[i - 1] <= arr[i]) {
                return false;
            }
        }
        return true;
    }

    private static int findMax(int[] arr) {
        int n = arr.length;
        int maxIndex = 0;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                maxIndex = i;
                max = arr[i];
            }
        }
        return maxIndex;
    }
}
