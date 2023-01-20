package baekjoon.bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2_10801 {
    public static void main(String[] args) throws IOException {

        int firstInt = 0;
        int secondInt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();
        String second = br.readLine();

        String[] firstArr = first.split(" ");
        String[] secondArr = second.split(" ");

        for (int i = 0; i < firstArr.length; i++) {
            int tmp1 = Integer.parseInt(firstArr[i]);
            int tmp2 = Integer.parseInt(secondArr[i]);

            if (tmp1 > tmp2) {
                firstInt++;
                continue;
            }
            if (tmp2 > tmp1) {
                secondInt++;
            }

        }

        if (firstInt > secondInt) {
            System.out.println("A");
        }
        if (secondInt > firstInt) {
            System.out.println("B");
        }
        if (secondInt == firstInt) {
            System.out.println("D");
        }
    }
}
