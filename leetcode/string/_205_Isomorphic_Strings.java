import java.util.HashMap;
import java.util.Map;

public class _205_Isomorphic_Strings {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            map.put(s.charAt(i), t.charAt(i));
        }
        System.out.println(map);
        return true;
    }
}
