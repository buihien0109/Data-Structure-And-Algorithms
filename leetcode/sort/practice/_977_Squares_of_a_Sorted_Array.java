import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {-2, -1};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int j = n;
        while ((j - 1) >= 0 && nums[j - 1] >= 0) {
            j--;
        }

        int i = -1;
        if(j >= 0 && j < n) {
            i = j - 1;
        } else if (j == n) {
            i = n - 1;
        }

        int k = 0;
        while (i >= 0 || j < n) {
            if (i >= 0 && j < n) {
                int ii = nums[i] * nums[i];
                int jj = nums[j] * nums[j];

                if (ii <= jj) {
                    ans[k] = ii;
                    i--;
                } else {
                    ans[k] = jj;
                    j++;
                }
                k++;
            } else if (i >= 0) {
                ans[k] = nums[i] * nums[i];
                i--;
                k++;
            } else {
                ans[k] = nums[j] * nums[j];
                j++;
                k++;
            }
        }

        return ans;

    }

//    public static int[] sortedSquares(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[n];
//
//        int i = 0;
//        int j = n - 1;
//        int k = n - 1;
//        while (i <= j) {
//            if (nums[i] * nums[i] > nums[j] * nums[j]) {
//                ans[k] = nums[i] * nums[i];
//                i++;
//            } else {
//                ans[k] = nums[j] * nums[j];
//                j--;
//            }
//            k--;
//        }
//
//        return ans;
//    }

//    public static int[] sortedSquares(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            int ii = nums[i] * nums[i];
//
//            // Chen vao vi tri thich hop trong ans
//            int j = 0;
//            while (j <= i) {
//                if (ii < ans[j]) {
//                    break;
//                } else {
//                    j++;
//                }
//            }
//            if (j <= i) {
//                for (int k = n - 2; k >= j; k--) {
//                    ans[k + 1] = ans[k];
//                }
//                ans[j] = ii;
//            } else {
//                ans[i] = ii;
//            }
//        }
//
//        return ans;
//    }

//    public static int[] sortedSquares(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            ans[i] = nums[i] * nums[i];
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (ans[j] > ans[j + 1]) {
//                    int temp = ans[j];
//                    ans[j] = ans[j + 1];
//                    ans[j + 1] = temp;
//                }
//            }
//        }
//
//        return ans;
//    }
}
