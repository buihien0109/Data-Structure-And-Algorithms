package array;

import java.util.List;

public class _2828_Check_if_a_String_Is_an_Acronym_of_Words {
    public static void main(String[] args) {
        List<String> words = List.of("an","apple");
        String s = "a";
        System.out.println(isAcronym(words, s));
    }

    public static boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length()) {
            return false;
        }

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }


//    public static boolean isAcronym(List<String> words, String s) {
//        StringBuilder sb = new StringBuilder();
//        words.forEach(w -> sb.append(w.charAt(0)));
//        return sb.toString().equals(s);
//    }

//    public static boolean isAcronym(List<String> words, String s) {
//        List<Character> characters = words.stream()
//                .map(w -> w.charAt(0))
//                .toList();
//
//        StringBuilder sb = new StringBuilder(characters.size());
//        for (Character ch : characters) {
//            sb.append(ch);
//        }
//        String str = sb.toString();
//        return str.equals(s);
//    }
}
