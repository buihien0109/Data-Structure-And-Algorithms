package array;

import java.util.Arrays;

public class _1929_Concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
        System.out.println("DONE");
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return nums;
        }

        int[] newNums = new int[n * 2];

        for (int i = 0; i < n; i++) {
            int j = i + n;
            newNums[i] = nums[i];
            newNums[j] = nums[i];
        }

        return newNums;
    }
}
