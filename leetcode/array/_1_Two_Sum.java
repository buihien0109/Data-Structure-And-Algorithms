package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 4, 3, 4 };
        System.out.println(Arrays.toString(twoSum3(nums, 8)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int data = target - nums[i];
            if (map.containsKey(data)) {
                return new int[] { map.get(data), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }

        return new int[] {};
    }
}
