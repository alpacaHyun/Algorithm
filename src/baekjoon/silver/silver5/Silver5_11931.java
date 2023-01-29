package baekjoon.silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Silver5_11931 {

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] answer = new int[num];

        for (int i = 0; i < num; i++) {
            answer[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(answer);
        answer = reverse(answer);

        for (int i = 0; i < answer.length; i++) {
            sb.append(answer[i]).append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);

    }

    private static int[] reverse(int[] answer) {

        for (int i = 0; i < answer.length / 2; i++) {
            int tmp = answer[i];
            answer[i] = answer[answer.length - i - 1];
            answer[answer.length - i - 1] = tmp;
        }

        return answer;
    }
}
