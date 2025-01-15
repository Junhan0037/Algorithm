package 배열;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 게임 캐릭터가 지난 길 중 캐릭터가 처음 걸어본 길의 길이를 구하는 문제
 */
public class 방문길이 {
    public static void main(String[] args) {
        String dirs = "ULURRDLLU";

        System.out.println(solution(dirs));
    }

    private static int solution(String dirs) {
        initLocation();
        int x = 5;
        int y = 5;
        Set<String> answer = new HashSet<>(); // 겹치는 좌표는 1개로 처리하기 위함

        // 주어진 명령어로 움직이면서 좌표 저장
        for (int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];

            if (!isValidMove(nx, ny)) { // 벗어난 좌표는 인정하지 않음
                continue;
            }

            // A 에서 B 로 간 경우 B 에서 A 도 추가해야 함 (총 경로의 개수는 방향성이 없음)
            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);

            // 좌표를 이동했으므로 업데이트
            x= nx;
            y = ny;
        }

        return answer.size() / 2;
    }

    private static final Map<Character, int[]> location = new HashMap<>();

    private static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }

    private static boolean isValidMove(int nx, int ny) {
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }
}
