public class _3110_Score_of_a_String {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }

    public static int scoreOfString(String s) {
        int ans = 0;
        int j = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            ans += Math.abs((int) s.charAt(i) - (int) s.charAt(j));
            j++;
        }

        return ans;
    }
}
