package programmers.level_1;

import java.util.ArrayList;
import java.util.List;

public class DivisorSum {

    public static void main(String[] args) {

        System.out.println(solution(10, 12));

    }

    public static int solution(int left, int right) {

        List<Integer> answerList = new ArrayList<>();

        int[] divisorArr = new int[right - left + 1];

        int tmp = 0;

        for (int i = left; i <= right; i++) {
            divisorArr[tmp] = i;
            tmp++;
        }

        for (int i = 0; i < divisorArr.length; i++) {
            int count = 0;
            for (int j = 1; j <= divisorArr[i]; j++) {
                if(divisorArr[i] % j == 0) {
                    count++;
                }
            }
            if(count % 2 == 0) {
                answerList.add(divisorArr[i]);
            }
            if (count % 2 == 1) {
                answerList.add(divisorArr[i] * -1);
            }
        }

        int answer = 0;
        for (int i = 0; i < answerList.size(); i++) {
            answer += answerList.get(i);
        }

        return answer;
    }
}
