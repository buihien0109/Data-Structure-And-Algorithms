package array;

import java.util.stream.IntStream;

public class _2778_Sum_of_Squares_of_Special_Elements {
    public static void main(String[] args) {
        int[] nums = {2, 7, 1, 19, 18, 3};
        System.out.println(sumOfSquares(nums));
    }

    public static int sumOfSquares(int[] nums) {
        int n = nums.length;
        return IntStream.range(0, n)
                .filter(i -> nums.length % (i + 1) == 0)
                .reduce(0, (total, i) -> total + nums[i] * nums[i]);
    }

//    public static int sumOfSquares(int[] nums) {
//        int sum = 0;
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            if(n % (i + 1) == 0) {
//                sum += nums[i] * nums[i];
//            }
//        }
//
//        return sum;
//    }
}
