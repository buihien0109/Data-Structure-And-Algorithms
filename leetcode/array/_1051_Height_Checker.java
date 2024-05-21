package array;

public class _1051_Height_Checker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};


    }

    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int[] copied = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            copied[i] = heights[i];
        }

        // Sort copied
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(copied[j] < copied[minIndex]) {
                    minIndex = j;
                }
            }

            if(minIndex != i) {
                int temp = copied[i];
                copied[i] = copied[minIndex];
                copied[minIndex] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if(copied[i] != heights[i]) {
                ans++;
            }
        }

        return ans;
    }
}
