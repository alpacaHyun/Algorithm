package baekjoon.silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver4_9290 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        // 게임 시작
        for (int i = 0; i < testCase; i++) {
            startGame(i);
            String[][] tickTakTok = new String[3][3];

            // 입력받기
            for (int j = 0; j < 3; j++) {
                String input = br.readLine();
                String[] inputArr = input.split("");
                for (int k = 0; k < 3; k++) {
                    tickTakTok[j][k] = inputArr[k];
                }

            }
            String inputOX = br.readLine();
            System.out.println(Arrays.deepToString(tickTakTok));

            // 비교하기  O, X 구분하기
            if (inputOX.equals("o")) {

            }

            if (inputOX.equals("x")) {

            }

        }

    }

    public static void startGame(int count) {
        System.out.println("Case " + (count + 1) + ":");
    }


}
