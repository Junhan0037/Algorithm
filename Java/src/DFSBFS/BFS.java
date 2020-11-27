package DFSBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // BFS 함수 정의
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        // 현재 노드를 방문 처리
        visited[start] = true;
        // 큐가 빌때까지 반복
        while (!queue.isEmpty()) {
            // 큐에서 하나씩 원소를 뽑아 출력
            int x = queue.poll();
            System.out.print(x + " ");
            // 해당 원소가 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if (!visited[y]) {
                    queue.offer(y);
                    visited[y] = true;
                }
            }
        }
    }


    public static void main(String[] args) {
        // 그래프 초기화
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // 노드에 연결된 노드 정보 저장
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);
        graph.get(2).add(1);
        graph.get(2).add(7);
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);
        graph.get(4).add(3);
        graph.get(4).add(5);
        graph.get(5).add(3);
        graph.get(5).add(4);
        graph.get(6).add(7);
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);
        graph.get(8).add(1);
        graph.get(8).add(7);

        // 정의된 BFS 함수 호출
        bfs(1);
    }

}
