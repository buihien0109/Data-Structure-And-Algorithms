package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1313_Decompress_Run_Length_Encoded_List {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }

    public static int[] decompressRLElist(int[] nums) {
        int newLength = 0;
        for (int i = 0; i < nums.length; i += 2) {
            newLength += nums[i];
        }
        int[] ans = new int[newLength];
        int k = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            int freq = nums[i];
            int val = nums[i+1];

            for (int j = 0; j < freq; j++) {
                ans[k] = val;
                k++;
            }
        }
        return ans;
    }

//    public static int[] decompressRLElist(int[] nums) {
//        List<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < nums.length - 1; i += 2) {
//            int freq = nums[i];
//            int val = nums[i+1];
//
//            for (int j = 0; j < freq; j++) {
//                ans.add(val);
//            }
//        }
//        return ans.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
//    }

//    public static int[] decompressRLElist(int[] nums) {
//        int newLength = 0;
//        for (int i = 0; i < nums.length; i += 2) {
//            newLength += nums[i];
//        }
//
//        int[] ans = new int[newLength];
//
//        int j = 0;
//        for (int i = 0; i < nums.length; i+=2) {
//            while (nums[i] > 0) {
//                ans[j] = nums[i + 1];
//                j++;
//                nums[i]--;
//            }
//        }
//
//        return ans;
//    }
}
