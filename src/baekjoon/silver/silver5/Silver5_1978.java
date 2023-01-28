package baekjoon.silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_1978 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        String input = br.readLine();
        for (int i = 0; i < testCase; i++) {
            String[] inputArr = input.split(" ");
            int[] tmp = new int[inputArr.length];
            for (int j = 0; j < inputArr.length; j++) {
                tmp[i] = Integer.parseInt(inputArr[i]);

            }
            int count = 0;
            for (int j = 1; j <= tmp[i]; j++) {
                if (tmp[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                answer++;
            }
        }
    }
}
