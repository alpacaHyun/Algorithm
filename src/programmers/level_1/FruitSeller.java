package programmers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FruitSeller {

    public static void main(String[] args) {
        int[] score = {5, 4, 3, 2, 1};

        System.out.println(solution(1, 2, score));
    }

    public static int solution(int k, int m, int[] score) {

        int answer = 0;
        int boxCount = (score.length / m);
        List<int[]> boxList = new ArrayList<>();
        int boxEnd = score.length;

        Arrays.sort(score);

        while(boxEnd > boxCount) {

            boxList.add(Arrays.copyOfRange(score, (boxEnd - boxCount), boxEnd));

            boxEnd -= boxCount;
        }

        return 0;
    }
}
