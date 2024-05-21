public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println("DONE");
    }

    public static void merge(int[] n1, int m, int[] n2, int n) {
        for (int i = 0; i < n2.length; i++) {
            insertToArr(n2[i], n1, m);
            m++;
        }
    }

    private static void insertToArr(int x, int[] a, int m) {
        boolean existEl = false;
        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                existEl = true;
                for (int i = m - 1; i >= k; i--) {
                    a[i + 1] = a[i];
                }
                a[k] = x;
                break;
            }
        }

        if (!existEl) {
            a[m] = x;
        }
    }
}
