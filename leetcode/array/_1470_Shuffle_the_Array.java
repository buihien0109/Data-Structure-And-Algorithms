package array;

import java.util.Arrays;

public class _1470_Shuffle_the_Array {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];

        for (int i = 0, j = 0; i < n ; i++) {
            ans[j] = nums[i];
            j++;
            ans[j] = nums[n+i];
            j++;
        }
        return ans;
    }

//    public static int[] shuffle(int[] nums, int n) {
//        int[] ans = new int[nums.length];
//
//        int l = 0;
//        int r = n;
//        for (int i = 0; i < ans.length; i++) {
//            if(i % 2 == 0) {
//                ans[i] = nums[l];
//                l++;
//            } else {
//                ans[i] = nums[r];
//                r++;
//            }
//        }
//        return ans;
//    }
}
