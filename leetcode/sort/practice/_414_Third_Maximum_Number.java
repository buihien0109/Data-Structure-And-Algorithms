public class _414_Third_Maximum_Number {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] arr) {
        long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for (int val : arr) {
            insertToArray(maxArr, val);
        }

        if (maxArr[2] == Long.MIN_VALUE) {
            return (int) maxArr[0];
        }
        return (int) maxArr[2];
    }

    private static void insertToArray(long[] arr, int x) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == x) {
                return;
            } else if (arr[i] < x) {
                break;
            } else {
                i++;
            }
        }

        if (i < n) {
            for (int j = n - 2; j >= i; j--) {
                arr[j + 1] = arr[j];
            }
            arr[i] = x;
        }
    }
}
