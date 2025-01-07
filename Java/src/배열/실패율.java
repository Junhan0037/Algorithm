package 배열;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 적이 있는 플레이어의 수
 */
public class 실패율 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(solution(N, stages)));
    }

    private static int[] solution(int N, int[] stages) {
        // 스테이지별 도전자 수를 구함
        int[] challengerStageArray = new int[N + 2]; // index 0 시작보다 1 부터 생각하면 편하기 때문에 N+1 대신에 N+2 사용
        for (int i = 0; i < stages.length; i++) {
            challengerStageArray[stages[i]] += 1;
        }

        System.out.println(Arrays.toString(Arrays.copyOfRange(challengerStageArray, 1, challengerStageArray.length)));

        Map<Integer, Double> failMap = new HashMap<>(); // 실패율
        double total = stages.length; // 총 사용자 수

        // 각 스테이지를 순회하며, 실패율 계산
        for (int i = 1; i <= N; i++) {
            int challengerStage = challengerStageArray[i];
            if (challengerStage == 0) { // 도전한 사람이 없는 경우, 실패율은 0
                failMap.put(i, 0.);
            } else {
                failMap.put(i, challengerStage / total); // 실패율 계산
                total -= challengerStage; // 다음 스테이지 실패율을 구하기 위해 현재 스테이지의 인원을 뺌
            }
        }

        System.out.println(failMap);

        // 실패율이 높은 스테이지부터 내림차순으로 정렬
        return failMap.entrySet().stream().sorted(((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))).mapToInt(Map.Entry::getKey).toArray();
    }
}
