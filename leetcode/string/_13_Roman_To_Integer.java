import java.util.HashMap;
import java.util.Map;

public class _13_Roman_To_Integer {
    public static void main(String[] args) {
        String s = "III";
        String s1 = "LVIII";
        String s2 = "MCMXCIV";
        System.out.println(romanToInt(s));
        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s2));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(
                Map.of(
                        'I', 1,
                        'V', 5,
                        'X', 10,
                        'L', 50,
                        'C', 100,
                        'D', 500,
                        'M', 1000));

        int total = 0;
        int i = 0;
        while (i < s.length()) {
            if(i == s.length() - 1) {
                total += map.get(s.charAt(i));
                break;
            }
            
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                total -= map.get(s.charAt(i));
            } else {
                total += map.get(s.charAt(i));
            }
            i++;
        }
        return total;
    }
}
