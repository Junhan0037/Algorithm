package 스택;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class 괄호회전하기 {
    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
        System.out.println(solution("}]()[{"));
    }

    private static int solution(String s) {
        // 괄호 정보를 저장함
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        int n = s.length(); // 원본 문자열의 길이 저장
        s += s; // 원본 문자열 뒤에 원본 문자열을 이어 붙여서 2번 나오도록 만들어줌
        int answer = 0;

        // 확인할 문자열의 시작 인덱스를 0부터 n까지 이동
        A: for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            // i (시작위치) 부터 원본 문자열의 길이인 n 개까지 올바른 괄호 문자열인지 확인
            for (int j = i; j < i + n; j++) {
                char c = s.charAt(j);
                // 맵안에 해당 키가 없다면 열리는 괄호임
                if (!map.containsKey(c)) {
                    stack.push(c);
                } else if (stack.isEmpty() || !stack.pop().equals(map.get(c))) {
                    continue A;
                }
            }
            // continue 되지 않았고, 스택이 비버있으면 올바른 괄호 문자열임
            if (stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
