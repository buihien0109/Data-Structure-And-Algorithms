package array;

public class _55_Jump_Game {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int goal = n - 1;
        int nextPostion = 0;

        for (int i = 0; i < n; i++) {
            int step = nums[i];
            if (nums[i] + step < goal) {
                nextPostion = i;
                goal -= goal - i;
            }
        }

        if (nextPostion == n) {
            return true;
        }

        return false;
    }
}
