package 손코딩;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test {
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> table = new HashMap<>();
        table.put(')', '(');
        table.put('}', '{');
        table.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            if (!table.containsKey(s.charAt(i))) stack.push(s.charAt(i));
            else if (stack.isEmpty() || stack.pop() != table.get(s.charAt(i))) return false;
        }

        return stack.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("()[]{}"));
    }
}