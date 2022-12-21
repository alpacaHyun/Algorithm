package programmers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitSeller {

    public static void main(String[] args) {
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        System.out.println(solution(4, 3, score));
    }

    public static int solution(int k, int m, int[] score) {

        int answer = 0;
        List<int[]> boxList = new ArrayList<>();
        int boxEnd = score.length;

        Arrays.sort(score);

        while (boxEnd - m >= 0) {
            boxList.add(Arrays.copyOfRange(score, (boxEnd - m), boxEnd));
            boxEnd -= m;
        }

        for (int i = 0; i < boxList.size(); i++) {
            int[] tmp = boxList.get(i);
            answer += tmp[0] * m;
        }

        return answer;
    }
}
