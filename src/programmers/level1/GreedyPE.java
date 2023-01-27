package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreedyPE {

    public static void main(String[] args) {
        int[] a = {2, 4};
        int[] b = {1, 3, 5};
        int n = 5;
        solution(n, a, b);
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {

                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -10;
                    answer++;
                    break;
                }
            }
        }
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {

                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        return answer;

    }
}