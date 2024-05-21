package array;

public class _268_Missing_Number {
    public static void main(String[] args) {
        int[] nums = {8, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];

        for (int num : nums) {
            count[num]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                return i;
            }
        }

        return -1;
    }

//    public static int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//
//        for (int i = 0; i < n ; i++) {
//            if(nums[i] != i) {
//                return i;
//            }
//        }
//        return n;
//    }
}
