package baekjoon.silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Silver5_10867 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int numbers = Integer.parseInt(input);

        input = br.readLine();
        String[] tmp = input.split(" ");
        int[] numberArr = new int[numbers];

        for (int i = 0; i < tmp.length; i++) {
            numberArr[i] = Integer.parseInt(tmp[i]);
        }


        Arrays.sort(numberArr);

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < numberArr.length - 1; i++) {
            if (numberArr[i] != numberArr[i + 1]) {
                answer.add(numberArr[i]);
            }
        }

        if (!answer.contains(numberArr[numberArr.length - 1])) {
            answer.add(numberArr[numberArr.length - 1]);
        }


        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i));
            System.out.print(" ");
        }

    }

}
