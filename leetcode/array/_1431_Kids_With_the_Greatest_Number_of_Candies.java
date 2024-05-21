package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1431_Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = findMax(candies);

        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

//    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int max = Arrays.stream(candies)
//                .max().orElse(0);
//
//        List<Integer> newCandies = Arrays.stream(candies)
//                .boxed()
//                .map(n -> n + extraCandies)
//                .toList();
//
//        return newCandies.stream()
//                .map(n -> n >= max)
//                .toList();
//    }
}
