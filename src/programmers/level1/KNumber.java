package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class KNumber {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        solution(array, commands);
    }

    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int from = commands[i][0];
            int to = commands[i][1];
            int num = commands[i][2];

            int[] tmp = new int[to - from + 1];

            int t = 0;
            for (int j = from - 1; j <= to - 1; j++) {
                tmp[t] = array[j];
                t++;
            }
            Arrays.sort(tmp);

            answer[i] = tmp[num - 1];
        }


        return answer;
    }

}
