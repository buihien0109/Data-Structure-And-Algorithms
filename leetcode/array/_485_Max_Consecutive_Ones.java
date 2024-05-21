package array;

public class _485_Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;

        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }

//    public static int findMaxConsecutiveOnes(int[] nums) {
//        int n = nums.length;
//        int[] count = new int[n];
//        int k = 0;
//
//        for (int num : nums) {
//            if (num == 1) {
//                count[k]++;
//            } else {
//                k++;
//            }
//        }
//
//        int maxCount = count[0];
//        for (int i = 0; i < n; i++) {
//            if(maxCount < count[i]) {
//                maxCount = count[i];
//            }
//        }
//        return maxCount;
//    }
}
