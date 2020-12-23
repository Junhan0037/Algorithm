package 손코딩;

import java.util.Scanner;

// 버블 정렬
public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        bubbleSort0(x, nx); // 배열 x를 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    private static void bubbleSort0(int[] a, int n) { // 일반적인 버전
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) swap(a, j, j + 1);
            }
        }
    }

    private static void bubbleSort(int[] a, int n) { // 버전 1
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) swap(a, j - 1, j);
            }
        }
    }

    private static void bubbleSort2(int[] a, int n) { // 버전 2
        for (int i = 0; i < n; i++) {
            int exchg = 0; // 패스의 교환 횟수를 기록
            for (int j = n - 1; j < i; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    exchg++;
                }
            }
            if (exchg == 0) break; // 교환이 이루어지지 않으면 종료
        }
    }

    private static void bubbleSort3(int[] a, int n) { // 버전 3
        int k = 0;
        while (k < n - 1) {
            int last = n - 1;
            for (int j = n - 1; j > k; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            k = last;
        }
    }

    private static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

}
