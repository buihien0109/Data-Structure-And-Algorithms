import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class _1859_Sorting_the_Sentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.naturalOrder());

        System.out.println(Arrays.toString(words));

        for (String word : words) {
            int index = Integer.parseInt(word.substring(word.length() - 1));
            String wordOriginal = word.substring(0, word.length() - 1);

            map.put(index, wordOriginal);
        }

        System.out.println(map);

        StringBuilder ans = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            ans.append(entry.getValue()).append(" ");
        }
        return ans.toString().trim();
    }
}
