package array;

public class _26_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    // Input: nums = [0,0,1,1,1,2,2,3,3,4]
    // Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int j = 1;
        for (int i = 0; i < length - 1; ) {
            if (nums[i] == nums[j]) {
                for (int k = j + 1; k < length; k++) {
                    nums[k - 1] = nums[k];
                }
                length--;
            } else {
                i++;
                j++;
            }
        }
        return length;
    }
}
