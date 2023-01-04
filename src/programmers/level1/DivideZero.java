package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivideZero {

    public int[] solution(int[] arr, int divisor) {

        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answerList.add(arr[i]);
            }
        }

        if(answerList.size() == 0) {
            int[] tmp = {-1};
            return tmp;
        }

        Collections.sort(answerList);

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }



        return answer;
    }

}
