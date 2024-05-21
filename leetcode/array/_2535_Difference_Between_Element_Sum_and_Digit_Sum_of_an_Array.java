package array;

public class _2535_Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array {
    public static void main(String[] args) {
        int[] nums = {1, 15, 6, 3};
        System.out.println(differenceOfSum(nums));
    }

    public static int differenceOfSum(int[] nums) {
        int sumNumber = 0;
        int sumDigit = 0;

        for(int num: nums) {
            sumNumber += num;

            if (num >= 10) {
                int subSumDigit = 0;
                while (num >= 10) {
                    subSumDigit += num % 10; // 132 % 10 = 2 | 13 % 10 = 3
                    num = num / 10; // 132 / 10 = 13 | 13 / 10 = 1 -> num = 1 + sumDigit
                }
                sumDigit += subSumDigit + num;
            } else {
                sumDigit += num;
            }
        }

        return Math.abs(sumNumber - sumDigit);
    }

//    public static int differenceOfSum(int[] nums) {
//        int sumNumber = 0;
//        int sumDigit = 0;
//
//        for(int num: nums) {
//            sumNumber += num;
//        }
//
//        for(int num: nums) {
//            if(num >= 10) {
//                sumDigit += sumDigitOfNumber(num);
//            } else {
//                sumDigit += num;
//            }
//        }
//
//        return Math.abs(sumNumber - sumDigit);
//    }
//
//    private static int sumDigitOfNumber(int num) {
//        String[] arr = String.valueOf(num).split("");
//        return Arrays.stream(arr)
//                .mapToInt(Integer::valueOf)
//                .sum();
//    }
}
