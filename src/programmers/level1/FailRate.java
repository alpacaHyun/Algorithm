package programmers.level1;

import java.util.Arrays;

public class FailRate {

    public static void main(String[] args) {

        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        solution(5, stages);
    }

    public static int[] solution(int N, int[] stages) {
        // 도전한사람 실패한사람 구하기
        double challenge = 0;
        double fail = 0;

        int[][] answer = new int[N][2];

        for (int i = 0; i < N; i++) {
            fail = 0;
            challenge = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    fail++;
                }
                if (stages[j] >= i + 1) {
                    challenge++;
                }
            }
            answer[i][0] = i + 1;
            answer[i][1] = (int)(100*(fail / challenge));
        }

        Arrays.sort(answer, (o1, o2) -> {
            return o1[1] - o2[1];
        });

        int[] tmp = new int[N];

        for (int i = 0; i < N; i++) {
            tmp[i] = answer[N - i-1][0];
        }

        for (int i = 0; i < tmp.length / 2; i++) {
            int z = tmp[i];
            tmp[i] = tmp[tmp.length - i - 1];
            tmp[tmp.length - i - 1] = z;
        }

        System.out.println();

        return tmp;
    }

}

