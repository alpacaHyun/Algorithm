package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class RemoveSmallNumber {



    public static int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min) {
                answerList.add(arr[i]);
            }
        }

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

}
