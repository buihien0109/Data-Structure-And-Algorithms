package array;

public class _2006_Count_Number_of_Pairs_With_Absolute_Difference_K {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        System.out.println(countKDifference(nums, k));
    }

    // TODO:  Can nghien cuu cach lam
    public static int countKDifference(int[] nums, int k) {
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }
        int numPairs = 0;
        for (int i = k; i <= 100; i++) {
            numPairs += count[i] * count[i - k];
        }
        return numPairs;
    }

//    public static int countKDifference(int[] nums, int k) {
//        int count = 0;
//        int n = nums.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if(Math.abs(nums[i] - nums[j]) == k) {
//                    count++;
//                }
//            }
//        }
//
//        return count;
//    }
}
