package array;

public class _3065_Minimum_Operations_to_Exceed_Threshold_Value_I {
    public static void main(String[] args) {
        int[] nums = {2,11,10,1,3};
        int k = 10;
        System.out.println(minOperations(nums, k));
    }

    public static int minOperations(int[] nums, int k) {
        int count = 0;
        for (int num : nums) {
            if (num < k) {
                count++;
            }
        }
        return count;
    }
}
