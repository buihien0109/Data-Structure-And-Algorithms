public class _125_Valid_Palindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String sLowerCase = s.toLowerCase();
        int MIN_C = 97; // a
        int MAX_C = 122; // z
        int MIN_N = 48; // 0
        int MAX_N = 57; // 9
        for (int i = 0; i < sLowerCase.length(); i++) {
            int cur = sLowerCase.charAt(i);
            if((cur >= MIN_C && cur <= MAX_C) || (cur >= MIN_N && cur <= MAX_N)) {
                sb.append((char) cur);
            }
        }

        return sb.toString().contentEquals(sb.reverse());
    }
}
