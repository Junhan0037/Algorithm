package 손코딩;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 신체검사 데이터 배열에서 이진 검색하기
public class PhysicalExamSearch {

    static class PhyscData { // 신체검사 데이터를 정의합니다.
        private String name; // 이름
        private int height; // 키
        private double vision; // 시력

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return name + " " + height + " " + vision;
        }

        // 오름차순으로 정렬하기 위한 Comparator
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return Integer.compare(o1.height, o2.height); // 비교 결과에 따라 1 or -1 or 0
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhysicalExamination.PhyscData[] x = {
                new PhysicalExamination.PhyscData("박현규", 162, 0.3),
                new PhysicalExamination.PhyscData("함진아", 173, 0.7),
                new PhysicalExamination.PhyscData("최윤미", 175, 2.0),
                new PhysicalExamination.PhyscData("홍연의", 171, 1.5),
                new PhysicalExamination.PhyscData("이수진", 168, 0.4),
                new PhysicalExamination.PhyscData("김영준", 174, 1.2),
                new PhysicalExamination.PhyscData("박용규", 169, 0.8)
        };
        System.out.print("몇 cm인 사람을 찾고 있나요? : ");
        int height = sc.nextInt();
//        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);
//
//        if (idx < 0) {
//            System.out.println("요소가 없습니다.");
//        } else {
//            System.out.println("x[" + idx + "]에 있습니다.");
//            System.out.println("찾은 데이터 : " + x[idx]);
//        }
    }

}
