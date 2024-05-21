package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _386_Lexicographical_Numbers {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(lexicalOrder(n));
    }

    public static List<Integer> lexicalOrder(int n) {
        List<String> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(String.valueOf(i));
        }

        Collections.sort(arr);
        List<Integer> ans = new ArrayList<>();
        for (String s : arr) {
            ans.add(Integer.valueOf(s));
        }

        return ans;
    }

//    public static List<Integer> lexicalOrder(int n) {
//        List<String> arr = new ArrayList<>();
//        for (int i = 1; i <= n ; i++) {
//            arr.add(String.valueOf(i));
//        }
//
//        return arr.stream()
//                .sorted()
//                .map(Integer::valueOf)
//                .toList();
//    }
}
