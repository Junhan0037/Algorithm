package 그리디;

import java.util.Scanner;

public class 숫자1이될때까지 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // N, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        while (n >= k) {
            // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            while (n % k != 0) {
                n -= 1;
                result += 1;
            }
            // K로 나누기
            n /= k;
            result += 1;
        }

        // 마지막으로 남은 수에 대하여 1씩 빼기
        while (n > 1) {
            n -= 1;
            result += 1;
        }

        System.out.println(result);
    }
}
