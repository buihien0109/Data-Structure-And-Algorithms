public class _3146_Permutation_Difference_between_Two_Strings {
    public static void main(String[] args) {
        String s = "abcde", t = "edbac";
        System.out.println(findPermutationDifference(s, t));
    }

    public static int findPermutationDifference(String s, String t) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += Math.abs(i - t.indexOf(s.charAt(i)));
        }
        return ans;
    }
}
