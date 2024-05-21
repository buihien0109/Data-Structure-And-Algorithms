package array;

import java.util.Arrays;

public class _605_Can_Place_Flowers {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;

        System.out.println(canPlaceFlowers(flowerbed, n));
        System.out.println(Arrays.toString(flowerbed));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int x) {
        int count = 0;
        int n = flowerbed.length;

        return count >= x;
    }

//    public static boolean canPlaceFlowers(int[] flowerbed, int x) {
//        int count = 0;
//        int n = flowerbed.length;
//
//        if(n == 1) {
//            if(flowerbed[0] == 0) {
//                return n >= x;
//            } else {
//                return x == 0;
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (flowerbed[i] == 0 && i == 0) {
//                if (flowerbed[i + 1] == 0) {
//                    flowerbed[0] = 1;
//                    count++;
//                }
//            } else if (flowerbed[i] == 0 && i == n - 1) {
//                if (flowerbed[i - 1] == 0) {
//                    flowerbed[0] = 1;
//                    count++;
//                    break;
//                }
//            } else {
//                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
//                    flowerbed[i] = 1;
//                    count++;
//                }
//            }
//        }
//
//        return count >= x;
//    }
}
