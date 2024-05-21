package array;

public class _1346_Check_If_N_and_Its_Double_Exist {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 5, 3 };
        int[] arr1 = { 3, 1, 7, 11 };

        System.out.println(checkIfExist(arr));
        System.out.println(checkIfExist(arr1));
    }

    public static boolean checkIfExist(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return false;
        }

        int[] doubleVal = new int[n];
        for (int i = 0; i < n; i++) {
            doubleVal[i] = arr[i] * 2;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < doubleVal.length; j++) {
                if (arr[i] == doubleVal[j] && i != j) {
                    return true;
                }
            }
        }

        return false;
    }
}
