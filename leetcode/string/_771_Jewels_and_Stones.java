public class _771_Jewels_and_Stones {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int[] countS = new int[123];

        for (int c : stones.toCharArray()) {
            countS[c]++;
        }

        int sum = 0;
        for (int c : jewels.toCharArray()) {
            sum += countS[c];
        }
        return sum;
    }
}
