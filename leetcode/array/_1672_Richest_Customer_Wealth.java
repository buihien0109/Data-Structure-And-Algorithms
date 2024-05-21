package array;

public class _1672_Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int total = 0;
            for (int i : account) {
                total += i;
            }
            max = Math.max(max, total);
        }
        return max;
    }
}
