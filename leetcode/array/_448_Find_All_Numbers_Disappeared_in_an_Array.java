package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _448_Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int [] frequency = new int[nums.length + 1];
        for(int num: nums) {
            frequency[num]+=1;
        }
        System.out.println(Arrays.toString(frequency));
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i < frequency.length; i++) {
            if(frequency[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }

//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        int n = nums.length;
//        boolean[] exist = new boolean[n + 1];
//
//        for (int num : nums) {
//            exist[num] = true;
//        }
//
//        List<Integer> ans = new ArrayList<>();
//        for (int i = 1; i < exist.length; i++) {
//            if(!exist[i]) {
//                ans.add(i);
//            }
//        }
//
//        return ans;
//    }
}
