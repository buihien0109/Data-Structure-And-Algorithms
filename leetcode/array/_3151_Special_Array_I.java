package array;

public class _3151_Special_Array_I {
    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 6};
        System.out.println(isArraySpecial(nums));
    }

    public static boolean isArraySpecial(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return true;
        }
        for (int i = 0; i < length - 1; i++) {
            if (Math.abs(nums[i] - nums[i + 1]) % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
