package baekjoon.bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bronze1_1292 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> answerList = new ArrayList<>();
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        int answer = 0;
        int count = 0;

        for (int i = 1; i < end + 1; i++) {
            answerList.add(i);
        }

        for (int z = start - 1; z < end; z++) {
            answer += answerList.get(z);
        }
        System.out.println(answer);
    }

}
