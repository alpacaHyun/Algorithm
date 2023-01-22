package baekjoon.bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2_2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        String a = sc.readLine();
        int testCase = Integer.parseInt(a);

        for (int i = 0; i < testCase; i++) {
            String tmp = "";

            String input = sc.readLine();

            String[] inputArr = input.split(" ");
            int loop = Integer.parseInt(inputArr[0]);
            String inputStr = inputArr[1];

            for (int j = 0; j < inputStr.length(); j++) {

                for (int k = 0; k < loop; k++) {
                    tmp += inputStr.charAt(j);
                }

            }
            System.out.println(tmp);

        }

    }
}
