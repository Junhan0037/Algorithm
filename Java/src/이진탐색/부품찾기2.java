package 이진탐색;

import java.util.HashSet;
import java.util.Scanner;

public class 부품찾기2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            s.add(x);
        }

        int m = scanner.nextInt();
        int[] targets = new int[n];
        for (int i = 0; i < m; i++) {
            targets[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            if (s.contains(targets[i])) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
