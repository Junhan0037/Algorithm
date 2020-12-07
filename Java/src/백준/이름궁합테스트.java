package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 이름궁합테스트 {

    public static final int[] alp = { 3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1 };

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String A = stringTokenizer.nextToken();
        String B = stringTokenizer.nextToken();

        StringBuilder result = new StringBuilder();

        int min_len = Math.min(N, M);
        for (int i = 0; i < min_len; i++) {
            result.append(A.charAt(i));
            result.append(B.charAt(i));
        }
        result.append(A.substring(min_len));
        result.append(B.substring(min_len));

        LinkedList<Integer> lst = new LinkedList<>();
        for (int i = 0; i < result.length(); i++) {
            lst.add(alp[result.charAt(i) - 'A']);
        }

        for (int i = 0; i < N + M - 2; i++) {
            for (int j = 0; j < N + M - 1 - i; j++) {
                int temp = (lst.get(j) + lst.get(j + 1)) % 10;
                lst.set(j, temp);
            }
        }

        int percent = lst.get(0) * 10 + lst.get(1);
        System.out.println(percent + "%");

    }
}
