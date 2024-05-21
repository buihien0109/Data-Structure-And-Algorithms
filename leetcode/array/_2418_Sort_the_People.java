package array;

import java.util.*;

public class _2418_Sort_the_People {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        int n = names.length;

        for (int i = 0; i < n; i++) {
            map.put(heights[i], i);
        }

        String[] ans = new String[n];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int index = entry.getValue();

            ans[i] = names[index];
            i++;
        }

        return ans;
    }
}
