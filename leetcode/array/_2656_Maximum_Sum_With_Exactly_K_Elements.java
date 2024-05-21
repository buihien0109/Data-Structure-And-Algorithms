package array;

public class _2656_Maximum_Sum_With_Exactly_K_Elements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 3;
        System.out.println(maximizeSum(nums, k));
    }

    public static int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int max = nums[0];

        for(int num : nums) {
            if(max < num) {
                max = num;
            }
        }

        for (int i = 0; i < k; i++) {
            sum += max;
            max++;
        }

        return sum;
    }
}
