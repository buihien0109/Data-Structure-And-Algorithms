package array;

public class _136_Single_Number {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }

    // Sử dụng XOR (dịch bit)
    /*
     * O ^ 0 = 0;
     * 1 ^ 1 = 0;
     * 0 ^ 1 = 1;
     * 1 ^ 0 = 0;
     * */
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

//    public static int singleNumber(int[] nums) {
//        int n = nums.length;
//        if (n == 1) {
//            return nums[0];
//        }
//
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue().equals(1)) {
//                return entry.getKey();
//            }
//        }
//
//        return -1;
//    }
}
