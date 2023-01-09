package baekjoon.silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver5_1439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int one = 0;
        int zero = 0;

        char tmp = input.charAt(0);

        if (tmp == '1') {
            one++;
        }

        if (tmp == '0') {
            zero++;
        }

        for (int i = 1; i < input.length(); i++) {
            if (tmp == input.charAt(i)) {
                continue;
            }

            tmp = input.charAt(i);

            if (tmp == '1') {
                one++;
            }

            if (tmp == '0') {
                zero++;
            }

        }

        System.out.println(Math.min(one, zero));

    }
}