public class _28_Find_The_Index_Of_The_First_Occurrence_In_A_String {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();

        if (n > h) {
            return -1;
        }

        for (int i = 0; i < h; i++) {
            char current = haystack.charAt(i);
            if (current == needle.charAt(0)) {
                String subStr = i + n <= h ? haystack.substring(i, i + n) : haystack.substring(i);
                if (needle.equals(subStr)) {
                    return i;
                }
            }
        }
        return -1;
    }

//    public static int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
//    }
}
