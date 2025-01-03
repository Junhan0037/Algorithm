package 배열;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * 서로 다른 인덱스에 있는 2개의 수를 뽑아 더해 만들 수 있는 모든 수를 배열에 오름차순으로 담아 반환
 */
public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        int[] input = {2, 1, 3, 4, 1};

        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(solution(input)));
    }

    private static int[] solution(int[] input) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                set.add(input[i] + input[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
