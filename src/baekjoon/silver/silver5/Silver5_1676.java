package baekjoon.silver.silver5;

import programmers.level1.WhereIsKim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Silver5_1676 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int ten = 0;
        int two = 0;
        int five = 0;

        for (int i = input; i > 0; i--) {
            int tmp = i;
            while (tmp % 2 == 0) {
                tmp /= 2;
                two++;
            }
            while (tmp % 5 == 0) {
                tmp /= 5;
                five++;
            }
        }

        System.out.println(Math.min(two, five));
    }
}
