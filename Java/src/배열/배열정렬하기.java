package 배열;

import java.util.Arrays;

public class 배열정렬하기 {
    public static void main(String[] args) {
        int[] arr = {1, -5, 2, 4, 3};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(solution(arr)));
    }

    private static int[] solution(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }
}
