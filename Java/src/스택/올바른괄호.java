package 스택;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        System.out.println(solution("(())"));
        System.out.println(solution("(((())"));
    }

    private static boolean solution(String input) {
        Stack<Character> stack = new Stack<>();

        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() == c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
