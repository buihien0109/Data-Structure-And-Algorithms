public class _1221_Split_A_String_In_Balanced_Strings {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        int n = s.length();
        int r = 0;
        int l = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                r++;
            } else if (s.charAt(i) == 'L') {
                l++;
            }

            if (r == l) {
                count++;
                r = 0;
                l = 0;
            }
        }

        return count;
    }
}
