package array;

import java.util.Arrays;

public class _2798_Number_of_Employees_Who_Met_the_Target {
    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4};
        int target = 2;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        return (int) Arrays.stream(hours)
                .filter(h -> h >=target)
                .count();
    }

//    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
//        int count = 0;
//        int n = hours.length;
//
//        for (int i = 0; i < n; i++) {
//            if(hours[i] >= target) {
//                count++;
//            }
//        }
//
//        return count;
//    }
}
