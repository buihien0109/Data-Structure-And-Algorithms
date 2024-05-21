public class _58_Length_Of_Last_Word {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                sb.append(s.charAt(i));
            }
            i--;
        }
        return sb.length();
    }
}
