package array;

import java.util.Arrays;

public class _2389_Longest_Subsequence_With_Limited_Sum {
    public static void main(String[] args) {
        int[] nums = {624082};
        int[] queries = {972985, 564269, 607119, 693641, 787608, 46517, 500857, 140097};
        // [2,3,4]
        System.out.println(Arrays.toString(answerQueries(nums, queries)));
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] sum = new int[nums.length];

        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        System.out.println(Arrays.toString(sum));

        int[] ans = new int[queries.length];
        for (int i = 0; i < ans.length; i++) {
            int j = 0;
            while (j < sum.length) {
                if (sum[j] > queries[i]) {
                    ans[i] = j;
                    break;
                }
                j++;
            }

            if (j == sum.length) {
                ans[i] = j;
            }
        }

        return ans;
    }
}
