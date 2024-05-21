package array;

import java.util.Arrays;

public class _1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] count = new int[101];

        for (int num : nums) {
            count[num]++;
        }

        System.out.println(Arrays.toString(count));

        int prev = 0;
        for (int i = 0; i < count.length; i++) {
            prev += count[i]; // Tổng số phần tử xuất hiển tại vị trí 0 -> i
            count[i] = prev - count[i]; // Tổng số phần tử xuất hiển tại vị trí i - 1 (chính là số lượng phần tử nhỏ hơn vị trí i)
        }

        System.out.println(Arrays.toString(count));

        for (int i = 0; i < n; i++) {
            ans[i] = count[nums[i]];
        }

        return ans;
    }

//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int n = nums.length;
//        int[] copied = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            copied[i] = nums[i];
//        }
//
//        // Sort arr increment
//        for (int i = 0; i < n; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < n; j++) {
//                if (copied[j] < copied[minIndex]) {
//                    minIndex = j;
//                }
//            }
//
//            if (minIndex != i) {
//                int temp = copied[i];
//                copied[i] = copied[minIndex];
//                copied[minIndex] = temp;
//            }
//        }
//
//        // Create map contains key and number of value less than key
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            if (!map.containsKey(copied[i])) {
//                map.put(copied[i], i);
//            }
//        }
//
//        // Create array ans -> mapping value
//        int[] ans = new int[n];
//        for (int i = 0; i < n; i++) {
//            ans[i] = map.get(nums[i]);
//        }
//
//        return ans;
//    }

//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            int current = nums[i];
//            int count = 0;
//            for (int j = 0; j < n; j++) {
//                if (i != j && current > nums[j]) {
//                    count++;
//                }
//            }
//            ans[i] = count;
//        }
//
//        return ans;
//    }
}
