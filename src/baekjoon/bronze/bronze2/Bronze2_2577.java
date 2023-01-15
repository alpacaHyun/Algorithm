package baekjoon.bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2_2577 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int third = Integer.parseInt(br.readLine());

        String multiple = String.valueOf(first * second * third);

        String[] checkNum = multiple.split("");

        int[] arr = new int[10];

        for (int i = 0; i < checkNum.length; i++) {
            arr[Integer.parseInt(checkNum[i])]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
