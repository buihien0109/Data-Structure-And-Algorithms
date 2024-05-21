public class _1768_Merge_Strings_Alternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int minLength = Math.min(word1.length(), word2.length());
        int maxLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i < minLength; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        for (int k = minLength; k < maxLength; k++) {
            if(word1.length() > minLength) {
                sb.append(word1.charAt(k));
            }

            if(word2.length() > minLength) {
                sb.append(word2.charAt(k));
            }
        }

        return sb.toString();
    }
}
