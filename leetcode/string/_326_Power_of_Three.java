public class _326_Power_of_Three {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }

        if (n == 0 || n % 3 != 0) {
            return false;
        }

        return isPowerOfThree(n / 3);
    }
}
