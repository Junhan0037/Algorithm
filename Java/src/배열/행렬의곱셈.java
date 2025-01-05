package 배열;

import java.util.Arrays;

public class 행렬의곱셈 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(solution(arr1, arr2)));
    }

    private static int[][] solution(int[][] arr1, int[][] arr2) {
        // 행과 열의 수
        int r1 = arr1.length;
        int r2 = arr2.length;
        int c1 = arr1[0].length;
        int c2 = arr2[0].length;

        // 결과를 저장할 2차원 배열 초기화
        int[][] answer = new int[r1][c2];

        // 첫번째 행렬의 각 행과 두번째 행렬의 각 열에 대해
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                // 두 행렬의 데이터를 곱해 결과 리스트에 더함
                for (int k = 0; k < c1; k++) {
                    answer[i][j] = arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }
}
