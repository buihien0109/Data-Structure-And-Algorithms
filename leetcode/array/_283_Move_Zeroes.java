package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _283_Move_Zeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] nums1 = {0, 0, 1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("DONE");
    }

    public static void moveZeroes(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            return;
        }

        int currentIndex = 0;
        List<Integer> nonZero = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                nonZero.add(arr[i]);
                currentIndex++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i < currentIndex) {
                arr[i] = nonZero.get(i);
            } else {
                arr[i] = 0;
            }
        }

    }

    public static void moveZeroes1(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            return;
        }

        List<Integer> nums = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> num1 = nums.stream()
                .filter(num -> !num.equals(0))
                .toList();

        List<Integer> num2 = nums.stream()
                .filter(num -> num.equals(0))
                .toList();

        List<Integer> result = new ArrayList<>();
        result.addAll(num1);
        result.addAll(num2);

        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
    }

    public static void moveZeroes2(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            return;
        }

        int currentIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[currentIndex] = arr[i];
                currentIndex++;
            }
        }

        for (; currentIndex < arr.length; currentIndex++) {
            arr[currentIndex] = 0;
        }
    }
}
