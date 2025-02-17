package 스택;

import java.util.Stack;

public class 숫자를2진수로 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(27));
    }

    private static String solution(int decimal) {
        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        // String 의 + 연산은 시간 복잡도 측면에서 성능이 좋지 않음
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
