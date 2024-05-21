package array;

import java.util.Arrays;

public class _1732_Find_the_Highest_Altitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n + 1];
        arr[0] = 0;

        for (int i = 0; i < n; i++) {
            arr[i + 1] = arr[i] + gain[i];
        }

        int max = arr[0];
        for (int i = 0; i < n + 1; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }
}
