package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2164_Sort_Even_and_Odd_Indices_Independently {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 3};
        System.out.println(Arrays.toString(sortEvenOdd(nums)));
    }

    public static int[] sortEvenOdd(int[] nums) {
        int n = nums.length;

        if (n <= 2) {
            return nums;
        }

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenList.add(nums[i]);
            } else {
                oddList.add(nums[i]);
            }
        }

        evenList.sort((a, b) -> a - b);
        oddList.sort((a, b) -> b - a);

        int[] ans = new int[n];
        int i = 0; // even
        int j = 0; // odd
        for (int k = 0; k < n; k++) {
            if (k % 2 == 0) {
                ans[k] = evenList.get(i);
                i++;
            } else {
                ans[k] = oddList.get(j);
                j++;
            }
        }

        return ans;
    }
}
