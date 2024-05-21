public class _2769_Find_the_Maximum_Achievable_Number {
    public static void main(String[] args) {
        int num = 4, t = 1;
        System.out.println(theMaximumAchievableX(num, t));
    }

    public static int theMaximumAchievableX(int num, int t) {
        return num + t * 2;
    }
}
