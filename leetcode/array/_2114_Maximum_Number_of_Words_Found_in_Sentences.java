package array;

import java.util.Arrays;

public class _2114_Maximum_Number_of_Words_Found_in_Sentences {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            int wordCount = sentence.split(" ").length;
            if (wordCount > max) {
                max = wordCount;
            }
        }
        return max;
    }

//    public static int mostWordsFound(String[] sentences) {
//        return Arrays.stream(sentences)
//                .map(s -> s.split(" ").length)
//                .mapToInt(n -> n)
//                .max()
//                .orElse(0);
//    }
}
