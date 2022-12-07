package baekjoon.bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로
 * 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 */

public class Bronze1_1193 {

    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int inputNum = Integer.parseInt(input);

        for (int i = 0; i < inputNum; i++) {
//            list.add()
        }

    }
}
