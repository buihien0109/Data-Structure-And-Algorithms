package array;

import java.util.Arrays;
import java.util.Collections;

public class _169_Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int haftLength = nums.length / 2;
        return nums[haftLength];
    }

    // Thuật toán Boyer-Moore Voting Algorithm
//    public static int majorityElement(int[] nums) {
//        int count = 0;
//        int candidate = 0;
//
//        for (int num : nums) {
//            if (count == 0) {
//                candidate = num;
//            }
//
//            if (num == candidate) {
//                count++;
//            } else {
//                count--;
//            }
//        }
//
//        return candidate;
//    }


//    public static int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        int haftEl = nums.length / 2;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            int key = entry.getKey();
//            int val = entry.getValue();
//
//            if(val > haftEl) {
//                return key;
//            }
//        }
//
//        return 0;
//    }
}
