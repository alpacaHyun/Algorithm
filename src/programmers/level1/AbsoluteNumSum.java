package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class AbsoluteNumSum {

    public int solution(int[] absolutes, boolean[] signs) {

        List<Integer> answerList = new ArrayList<>();

        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true) {
                answerList.add(absolutes[i]);
                continue;
            }

            if(signs[i] == false) {
                answerList.add(absolutes[i] * -1);
            }
        }

        for (int i = 0; i < answerList.size(); i++) {
            answer += answerList.get(i);
        }

        return answer;
    }

}
