public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEvenNumberOfDigits(nums[i])) {
                count++;
            }
        }
        return count;
    }

    // private static boolean isEvenNumberOfDigits(int num) {
    // int count = 0;
    // int kq = num;
    // while (kq != 0) {
    // kq = num / 10;
    // num = kq;
    // count++;
    // }
    // return count % 2 == 0;
    // }

    private static boolean isEvenNumberOfDigits(int num) {
        String numStr = String.valueOf(num);
        return numStr.length() % 2 == 0;
    }
}
