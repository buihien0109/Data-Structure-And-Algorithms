package array;

import java.util.Arrays;

public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return getSequence(word1).equals(getSequence(word2));
    }

    private static String getSequence(String[] word) {
        StringBuilder sb = new StringBuilder();
        for (String s : word) {
            sb.append(s);
        }
        return sb.toString();
    }

//    private static String getSequence(String[] word) {
//        String rs = "";
//        for (String s : word) {
//            rs = rs.concat(s);
//        }
//        return rs;
//    }

//    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        String sequence1 = Arrays.stream(word1)
//                .reduce("", String::concat);
//        String sequence2 = Arrays.stream(word2)
//                .reduce("", String::concat);
//
//        return sequence1.equals(sequence2);
//    }
}
