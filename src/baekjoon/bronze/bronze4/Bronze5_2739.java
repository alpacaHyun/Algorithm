package baekjoon.bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze5_2739 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String input = br.readLine();
        int number = Integer.parseInt(input);

        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }


    }
}
