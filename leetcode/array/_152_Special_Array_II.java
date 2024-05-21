package array;

import java.util.Arrays;

public class _152_Special_Array_II {
    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 6};
        int[][] queries = {{0, 2}, {2, 3}};
        System.out.println(Arrays.toString(isArraySpecial(nums, queries)));
    }

    // TODO: Chưa tối ưu cách làm
    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            ans[i] = checkArray(nums, queries[i]);
        }

        return ans;
    }

    private static boolean checkArray(int[] nums, int[] query) {
        int startIndex = query[0];
        int endIndex = query[1];

        if(startIndex == endIndex) {
            return true;
        }

        for (int i = startIndex; i <= endIndex - 1 ; i++) {
            if (Math.abs(nums[i] - nums[i + 1]) % 2 == 0) {
                return false;
            }
        }

        return true;
    }
}
