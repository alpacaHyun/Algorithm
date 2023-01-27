package baekjoon.gold.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Gold5_1011 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int from;
        int to;
        int count;
        int distance;
        int start;


        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String input = br.readLine();
            String[] s = input.split(" ");
            from = Integer.parseInt(s[0]);
            to = Integer.parseInt(s[1]);
            distance = to - from;

            int max = (int) Math.sqrt(distance);

            if (max == Math.sqrt(distance)) {
                count = max * 2 - 1;
                System.out.println(count);
            }else if(distance < max * max + max){
                count = max * 2;
            }else{
                count = max * 2 + 1;
                System.out.println(count);
            }



        }
    }
}
