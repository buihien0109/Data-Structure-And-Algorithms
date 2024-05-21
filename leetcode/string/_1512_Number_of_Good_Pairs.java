import java.util.HashMap;
import java.util.Map;

public class _1512_Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
    }

//    public static int numIdenticalPairs(int[] nums) {
//        int length = nums.length;
//        int count = 0;
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                if (nums[i] == nums[j] && i < j) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

//    public static int numIdenticalPairs(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        int count = 0;
//        for(Integer val : map.values()) {
//            if(val > 1) {
//                count += (val * (val - 1)) / 2;
//            }
//        }
//
//        return count;
//    }

    // TODO: Can xem lai solution nay
    public static int numIdenticalPairs(int[] nums) {
        int goodPair = 0;
        int[] count = new int[101];

        for (int n: nums) {
            goodPair += count[n]++;
        }

        return goodPair;
    }
}
