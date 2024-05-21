public class _14_Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char character = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i) {
                    return sb.toString();
                }
                if (strs[j].charAt(i) != character) {
                    return sb.toString();
                }
            }
            sb.append(character);
        }
        return sb.toString();
    }
}
