public class _151_Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String s = " a good   example ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].isEmpty()) {
                sb.append(arr[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

//    public static String reverseWords(String s) {
//        String stringFormatted = s.trim();
//        List<String> words = new ArrayList<>(Arrays.stream(stringFormatted.split(" "))
//                .filter(w -> !w.isEmpty())
//                .toList());
//
//        Collections.reverse(words);
//
//        return String.join(" ", words);
//    }
}
