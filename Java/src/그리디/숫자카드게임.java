package 그리디;

import java.util.*;

public class 숫자카드게임 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int result = 0;

        // 한 줄씩 입력 받아 확인하기
        for (int i = 0; i < n; i++) {
            List data = new ArrayList();
            for (int j = 0; j < m; j++) {
                data.add(scanner.nextInt());
            }
            // 현재 줄에서 '가장 작은 수' 찾기
            int min_value = (int) Collections.min(data);
            // '가장 작은 수'들 중에서 가장 큰 수 찾기
            result = Math.max(result, min_value);
        }

        System.out.println(result);
    }
}
