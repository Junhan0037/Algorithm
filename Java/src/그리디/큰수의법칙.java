package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class 큰수의법칙 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // N, M, K를 공백을 기준으로 구분하여 입력받기
        int n = scanner.nextInt();
        int m = scanner.nextInt(); // 총 횟수
        int k = scanner.nextInt(); // 연속해서 더할 수 있는 횟수

        // N개의 수를 공백을 기준으로 구분하여 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr); // 입력 받은 수들 정렬하기
        int first = arr[n - 1]; // 가장 큰 수
        int second = arr[n - 2]; // 두 번째로 큰 수

        int result = 0;
        while (true) {
            for (int i = 0; i < k; i++) { // 가장 큰 수를 K번 더하기
                if (m == 0) break; // m이 0이라면 반복문 탈출
                result += first;
                m -= 1; // 더할 때마다 1씩 빼기
            }
            if (m == 0) break; // m이 0이라면 반복문 탈출
            result += second;
            m -= 1; // 더할 때마다 1씩 빼기
        }

        System.out.println(result);
    }
}
