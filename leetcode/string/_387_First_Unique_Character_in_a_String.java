import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _387_First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        System.out.println(map);

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int val = entry.getValue();

            if(val == 1) {
                return s.indexOf(key);
            }
        }
        return -1;
    }

//    public static int firstUniqChar(String s) {
//        int[] count = new int[123];
//
//        for (int i = 0; i < s.length(); i++) {
//            int val = (int) s.charAt(i);
//            count[val]++;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            int val = (int) s.charAt(i);
//            if(count[val] == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
