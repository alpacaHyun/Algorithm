package baekjoon.silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver5_1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String tmp = br.readLine();
        String[] answer = tmp.split("");
        Arrays.sort(answer);
        swap(answer);

        String a = "";

        for (int i = 0; i < answer.length; i++) {
            a += answer[i];
        }

        int z = Integer.parseInt(a);
        System.out.println(z);
    }

    private static String[] swap(String[] answer) {

        for (int i = 0; i < answer.length / 2; i++) {
            String tmp = answer[i];
            answer[i] = answer[answer.length - i - 1];
            answer[answer.length - i - 1] = tmp;
        }

        return answer;
    }

}


