package 손코딩;

import java.util.Scanner;

// 이진 검색
public class BinSearch {

    private static int binSearch(int[] a, int n, int key) { // 요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색 합니다.
        int start = 0; // 검색 범위의 첫 인덱스
        int end = n - 1; // 검색 범위의 끝 인덱스

        do{
            int mid = (start + end) / 2;
            if (a[mid] == key) return mid;
            else if (a[mid] < key) start = mid + 1; // 검색 범위를 뒤쪽 절반으로 좁힘
            else end = mid - 1; // 검색 범위를 앞쪽 절반으로 좁힘
        } while (start <= end);

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : "); // 첫 요소 입력
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]); // 바로 앞 요소보다 작으면 다시 입력
        }

        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();

        int idx = binSearch(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky + "는 x[" + idx + "]에 있습니다.");
        }
    }

}
