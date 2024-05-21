package array;

import java.util.List;

public class _1773_Count_Items_Matching_a_Rule {
    public static void main(String[] args) {

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        List<String> keys = List.of("type", "color", "name");
        for (List<String> item : items) {
            int keyIndex = keys.indexOf(ruleKey);
            if(item.get(keyIndex).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

//    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int count = 0;
//        for (List<String> item : items) {
//            Map<String, String> map = new HashMap<>();
//            map.put("type", item.get(0));
//            map.put("color", item.get(1));
//            map.put("name", item.get(2));
//
//            if(map.get(ruleKey).equals(ruleValue)) {
//                count++;
//            }
//        }
//        return count;
//    }
}
