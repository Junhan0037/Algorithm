package 이진탐색;

import java.util.Scanner;

public class 부품찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[1000001];
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            arr[x] = 1;
        }

        int m = scanner.nextInt();
        int[] targets = new int[n];
        for (int i = 0; i < m; i++) {
            targets[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            if (arr[targets[i]] == 1) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
