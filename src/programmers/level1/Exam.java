package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    public static void main(String[] args) {
        int[] answer = {1,3,2,4,2};
        solution(answer);
    }

    public static int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int tmpA = 0;
        int tmpB = 0;
        int tmpC = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) {
                tmpA++;
            }
            if (answers[i] == b[i % b.length]) {
                tmpB++;
            }
            if (answers[i] == c[i % c.length]) {
                tmpC++;
            }
        }

        int max = Math.max(Math.max(tmpA, tmpB), tmpC);

        List<Integer> list = new ArrayList<>();

        if (tmpA == max) {
            list.add(1);
        }
        if (tmpB == max) {
            list.add(2);
        }
        if (tmpC == max) {
            list.add(3);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;

    }


}
