package array;

import java.util.Arrays;

public class _75_Sort_Colors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int num : nums) {
            count[num]++;
        }

        int k = 0;
        for (int i = 0; i < count.length; i++) {
            int freq = count[i];
            for (int j = 0; j < freq; j++) {
                nums[k] = i;
                k++;
            }
        }
    }
}
