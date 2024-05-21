package array;

public class _836_Rectangle_Overlap {
    public static void main(String[] args) {
        int[] rec1 = {0, 0, 1, 1};
        int[] rec2 = {2, 2, 3, 3};

        System.out.println(isRectangleOverlap(rec1, rec2));
    }

    // x1, y1, x2, y2
    // 0,  1,  2,  3
    // 0,  1,  2,  3
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0];
        int y1 = rec1[1];
        int x2 = rec1[2];
        int y2 = rec1[3];

        int x3 = rec2[0];
        int y3 = rec2[1];
        int x4 = rec2[2];
        int y4 = rec2[3];

        boolean insideX = (x2 > x3) && (x1 < x4);
        boolean insideY = (y2 > y3) && (y1 < y4);
        return insideX && insideY;
    }
}
