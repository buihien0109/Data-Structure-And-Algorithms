package array;

import java.util.HashMap;
import java.util.Map;

public class _1528_Shuffle_String {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder ans = new StringBuilder();
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(indices[i], s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            ans.append(map.get(i));
        }

        return ans.toString();
    }

//    public static String restoreString(String s, int[] indices) {
//        String[] arr = new String[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            String character = String.valueOf(s.charAt(i));
//            arr[indices[i]] = character;
//        }
//        return String.join("", arr);
//    }
}
