package baekjoon.bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
public class Bronze5_10869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] tmp = input.split(" ");

        int first = Integer.parseInt(tmp[0]);
        int second = Integer.parseInt(tmp[1]);

        System.out.println(first + second);
        System.out.println(first - second);
        System.out.println(first * second);
        System.out.println(first / second);
        System.out.println(first % second);

    }
}
