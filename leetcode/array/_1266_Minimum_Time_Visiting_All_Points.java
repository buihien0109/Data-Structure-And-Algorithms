package array;

public class _1266_Minimum_Time_Visiting_All_Points {
    public static void main(String[] args) {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int second = 0;
        int n = points.length;

        for (int i = 0; i < n - 1; i++) {
            int currentX = points[i][0];
            int currentY = points[i][1];
            int nextX = points[i + 1][0];
            int nextY = points[i + 1][1];

            int dx = Math.abs(currentX - nextX);
            int dy = Math.abs(currentY - nextY);

            second += Math.max(dx, dy);
        }
        return second;
    }
}
