package array;

import java.util.Arrays;

public class _1480_Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] runningSum = new int[n];

        if(n <= 1) {
            return nums;
        }

        for (int i = 1; i < n; i++) {
            if(i - 1 == 0) {
                runningSum[0] = nums[0];
            }
            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        return runningSum;
    }
}
