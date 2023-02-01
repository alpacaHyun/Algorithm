package programmers.level1;

import java.util.ArrayList;
import java.util.List;

/*
 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
  2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
  3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
 */
public class MathFail {

    public int[] solution(int[] answers) {
        int[] answerA = {1, 2, 3, 4, 5};
        int[] answerB = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answerC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5,};

        int answerACount = 0;
        int answerBCount = 0;
        int answerCCount = 0;

        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];

            if (answerA[i % answerA.length] == answer) {
                answerACount++;
            }

            if (answerB[i % answerB.length] == answer) {
                answerBCount++;
            }

            if (answerC[i % answerC.length] == answer) {
                answerCCount++;
            }
        }

        int maxNum = Math.max(answerACount, Math.max(answerBCount, answerCCount));

        List<Integer> answerList = new ArrayList<>();

        if (maxNum == answerACount) {
            answerList.add(1);
        }
        if (maxNum == answerBCount) {
            answerList.add(2);
        }
        if (maxNum == answerCCount) {
            answerList.add(3);
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }


}

/*
문제 풀이
1,2,3 번의 찍은 정답의 규칙대로 배열 생성
for 문을 돌리며 정답의 i 번째와, 1 2 3번의 정답 배열 i 번째를 비교한다.
i 가 찍은 정답의 길이보다 길어질 수 있으므로, i % 찍은정답길이 를 해준다.

Math.max 를 이용해서 정답의 최댓값을 구하고,
max 와 같은 값을 List 에 추가해준다.

1, 2, 3 순서대로 List 에 더햐줬으므로, 정렬을 추가로 하지 않고
answerArr 배열을 만들어서 답을 추가해준다.
 */