import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _20_Valid_Parentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        int n = s.length();

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < n) {
            char current = s.charAt(i);
            if (map.containsKey(current)) {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char lastInStack = stack.pop();
                char closeOfLastInStack = map.get(lastInStack);

                if (current != closeOfLastInStack) {
                    return false;
                }
            }
            i++;
        }

        return stack.empty();
    }
}
