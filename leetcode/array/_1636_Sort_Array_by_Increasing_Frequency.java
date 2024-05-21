package array;

import java.util.*;

public class _1636_Sort_Array_by_Increasing_Frequency {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 3, 2};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Lấy danh sách key
        List<Integer> keylist = new ArrayList<>(map.keySet());

        // Sắp xếp key - Nếu cùng tần số -> sắp xếp giảm dần theo key.
        // Nếu không cùng tần số -> sắp xếp tăng dần theo tần số
        Collections.sort(keylist, (a, b) -> map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b));

        int[] res = new int[nums.length];
        int i = 0;
        for (int num : keylist) {
            for (int j = 0; j < map.get(num); j++) {
                res[i] = num;
                i++;
            }
        }
        return res;
    }

//    public static int[] frequencySort(int[] nums) {
//        Map<Integer, Integer> freq = new HashMap<>();
//        for (int i : nums) {
//            freq.put(i, freq.getOrDefault(i, 0) + 1);
//        }
//
//        int[] ans = new int[nums.length];
//        int k = 0;
//
//        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freq.entrySet());
//        entries.sort(Comparator
//                .comparingInt(Map.Entry<Integer, Integer>::getValue)  // Sắp xếp trước theo value
//                .thenComparing(Map.Entry<Integer, Integer>::getKey, Comparator.reverseOrder()));
//
//
//        for (Map.Entry<Integer, Integer> entry : entries) {
//            Integer key = entry.getKey();
//            Integer value = entry.getValue();
//
//            for (int i = 0; i < value; i++) {
//                ans[k] = key;
//                k++;
//            }
//        }
//
//        return ans;
//    }
}
