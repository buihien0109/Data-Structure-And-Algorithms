import java.util.Arrays;

public class Demo_Recursion {
    // Hàm đệ quy: Là hàm mà trong phần thân hàm gọi đến chính nó
    public static void F() {
        System.out.println("F");
        F();
    }

    // Fibonacci
    public static int fibonacci(int n) {
        System.out.printf("Tinh F(%s)".formatted(n));
        // Bai toan co so
        if (n <= 2) {
            return 1;
        }

        // Cong thuc quy nap
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // De quy co nho
    public static int[] F = new int[1000];

    public static int fibonacci2(int n) {
        if (F[n] != 0) {
            return F[n];
        }
        System.out.printf("Tinh F(%s)".formatted(n));

        // Bai toan co so
        if (n <= 2) {
            F[1] = 1;
            F[2] = 1;
            return 1;
        }

        // Cong thuc quy nap
        F[n] = fibonacci2(n - 1) + fibonacci2(n - 2);
        return F[n];
    }

    public static int fibonacci3(int n) {
        int[] F = new int[n + 1];
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i <= n; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        System.out.println(Arrays.toString(F));
        return F[n];
    }

    // In mang
    public static void printElement(int[] arr, int index) {
        // Bai toan co so
        if (index < 0 || index >= arr.length) {
            return;
        }

        // Cong thuc quy nap
        System.out.println(arr[index]); // In tang dan
        printElement(arr, index + 1);
        System.out.println(arr[index]); // In giam dan
        // Can ve cay de quy de biet quy trinh thuc hien
    }

    public static void main(String[] args) {
//        System.out.println(fibonacci(5));
//        System.out.println(fibonacci2(5));
        System.out.println(fibonacci3(5));

//        int[] arr = new int[]{1, 2, 3, 4, 5};
//        printElement(arr, 0);
    }
}
