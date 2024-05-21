import java.util.List;

public class _345_Reverse_Vowels_of_a_String {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        String[] arr = s.split("");
        List<String> vowels = List.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");

        int i = 0;
        int j = arr.length - 1;
        for (int k = 0; k < arr.length; k++) {
            if (i <= j) {
                if (vowels.contains(arr[i])) {
                    if (vowels.contains(arr[j])) {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        i++;
                    }
                    j--;
                } else {
                    i++;
                }
            }
        }

        return String.join("", arr);
    }
}
