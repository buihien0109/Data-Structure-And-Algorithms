package array;

import java.util.ArrayList;
import java.util.List;

public class _2942_Find_Words_Containing_Character {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';
        System.out.println(findWordsContaining(words, x));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            int j = 0;
            char[] chars = words[i].toCharArray();
            while (j < chars.length) {
                if(chars[j] == x) {
                    ans.add(i);
                    break;
                }
                j++;
            }
        }

        return ans;
    }

//    public static List<Integer> findWordsContaining(String[] words, char x) {
//        List<Integer> ans = new ArrayList<>();
//
//        for (int i = 0; i < words.length; i++) {
//            if(words[i].contains(Character.toString(x))) { // Có thể sử dụng indexOf, match để thay thế
//                ans.add(i);
//            }
//        }
//
//        return ans;
//    }
}
