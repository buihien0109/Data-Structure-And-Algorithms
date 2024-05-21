public class _27_Remove_Element {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        System.out.println(removeElement2(nums, val));
        System.out.println("DONE");
    }

    public static int removeElement(int[] a, int x) {
        int n = a.length;
        for (int i = 0; i < n;) {
            if (a[i] == x) {
                for (int j = i; j < n - 1; j++) {
                    a[j] = a[j + 1];
                }
                n--;
            } else {
                i++;
            }
        }

        return n;
    }

    public static int removeElement2(int[] a, int x) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != x) {
                a[k] = a[i];
                k++;
            }
        }

        return k;
    }
}
