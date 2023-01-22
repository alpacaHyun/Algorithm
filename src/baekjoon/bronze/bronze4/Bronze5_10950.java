package baekjoon.bronze.bronze4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze5_10950 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int testCase = Integer.parseInt(input);

        for (int i = 0; i < testCase; i++) {
            input = br.readLine();
            String[] tmp = input.split(" ");

            System.out.println(Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1]));

        }
    }
}
