package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HallOfFame {

    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        solution(k, score);
    }

    public static int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list);

            if (i < k) {
                answer[i] = list.get(0);
                continue;
            }
            answer[i] = list.get(list.size() - k);
        }

        return answer;
    }

}
