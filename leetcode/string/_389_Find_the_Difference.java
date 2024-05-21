import java.util.Arrays;

public class _389_Find_the_Difference {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        String merge = s.concat(t);
        int[] count = new int[123];

        for (char c : merge.toCharArray()) {
            count[(int) c]++;
        }

        System.out.println(Arrays.toString(count));
        System.out.println(count[97]);

        for (int i = 0; i < count.length; i++) {
            if(count[i] % 2 == 1) {
                return (char) i;
            }
        }

        return 'a';
    }
}
