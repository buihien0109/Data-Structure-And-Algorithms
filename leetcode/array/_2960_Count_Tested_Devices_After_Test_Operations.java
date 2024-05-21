package array;

public class _2960_Count_Tested_Devices_After_Test_Operations {
    public static void main(String[] args) {
        int[] batteryPercentages = {1,1,2,1,3};
        System.out.println(countTestedDevices(batteryPercentages));
    }

    /*
    * {1,1,2,1,3};
    * t = 0;
    * 1 > t -> true -> t = 1;
    * 2 > t -> true -> t = 2;
    * 3 > t -> true -> t = 3;
    * */
    public static int countTestedDevices(int[] arr) {
        int count = 0;
        int t = 0;

        for (int num : arr) {
            if (num - t > 0) { // Mỗi khi găp trường hợp num > 0 thì t tăng lên 1
                t++;
                count++;
            }
        }

        return count;
    }

//    public static int countTestedDevices(int[] arr) {
//        int count = 0;
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != 0) {
//                for (int j = i + 1; j < n; j++) {
//                    arr[j] = Math.max(0, arr[j] - 1);
//                }
//                count++;
//            }
//        }
//
//        return count;
//    }
}
