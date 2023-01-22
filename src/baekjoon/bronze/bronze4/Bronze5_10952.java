package baekjoon.bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze5_10952 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int b = 1;

        while (a + b != 0) {
            String input = br.readLine();
            String[] tmp = input.split(" ");

            a = Integer.parseInt(tmp[0]);
            b = Integer.parseInt(tmp[1]);

            if (a + b != 0) {

                System.out.println(a + b);
            }


        }


    }
}
