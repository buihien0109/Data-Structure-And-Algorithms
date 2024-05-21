package array;

public class _3131_Find_the_Integer_Added_to_Array_I {
    public static void main(String[] args) {
        int[] nums1 = {2, 6, 4};
        int[] nums2 = {9, 7, 5};
        System.out.println(addedInteger(nums1, nums2));
    }

    // Cách 2 có thể sắp xếp rồi so sánh
    public static int addedInteger(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int sum1 = 0;
        int sum2 = 0;

        for (int num : nums1) {
            sum1 += num;
        }

        for (int num : nums2) {
            sum2 += num;
        }

        if(sum1 == sum2) {
            return 0;
        }

        int addNumber = Math.abs((sum1 - sum2) / n);
        if (sum1 > sum2) {
            return -addNumber;
        }
        return addNumber;
    }
}
