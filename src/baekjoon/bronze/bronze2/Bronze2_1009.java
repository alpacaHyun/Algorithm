package baekjoon.bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze2_1009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        StringTokenizer input;

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {

            input = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(input.nextToken());
            int b = Integer.parseInt(input.nextToken());

            int value = 1;

            for (int j = 0; j < b; j++) {
                value = (value * a) % 10;
            }
            if (value == 0) {
                answer.append(10).append("\n");
                continue;
            }
            answer.append(value).append("\n");

        }
        System.out.println(answer);
    }

}
