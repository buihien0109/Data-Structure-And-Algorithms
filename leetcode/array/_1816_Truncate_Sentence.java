package array;

public class _1816_Truncate_Sentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(" ")) {
                count++;
            }
            if (count == k) {
                return s.substring(0, i);
            }
        }
        return null;
    }

//    public static String truncateSentence(String s, int k) {
//        String ans = "";
//        for (int i = 0; i < s.length(); i++) {
//            if(String.valueOf(s.charAt(i)).equals(" ")) {
//                k--;
//                if(k == 0) {
//                    return ans;
//                }
//            }
//
//            ans = ans.concat(String.valueOf(s.charAt(i)));
//        }
//        return ans;
//    }

//    public static String truncateSentence(String s, int k) {
//        StringBuilder ans = new StringBuilder();
//        String[] arr = s.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            if(i < k) {
//                ans.append(" ");
//                ans.append(arr[i]);
//            }
//        }
//        return ans.toString().trim();
//    }

}
