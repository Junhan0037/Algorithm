package 이진탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 떡볶이떡만들기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int start = 0;
        Arrays.sort(arr);
        int end = arr[arr.length - 1];
        int result = 0;
        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;
            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) total += arr[i] - mid;
            }
            if (total < m) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }

        System.out.println(result);
    }
}
