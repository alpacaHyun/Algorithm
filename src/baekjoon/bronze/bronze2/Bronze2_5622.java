package baekjoon.bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2_5622 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] z = a.split("");
        int time = 0;
        String q;

        for (int i = 0; i < z.length; i++) {
            q = z[i];
            if (q.equals("A") || q.equals("B") || q.equals("C")) {
                time += 3;
            }
            if (q.equals("D") || q.equals("E") || q.equals("F")) {
                time += 4;
            }
            if (q.equals("G") || q.equals("H") || q.equals("I")) {
                time += 5;
            }
            if (q.equals("J") || q.equals("K") || q.equals("L")) {
                time += 6;
            }
            if (q.equals("M") || q.equals("N") || q.equals("O")) {
                time += 7;
            }
            if (q.equals("P") || q.equals("Q") || q.equals("R") || q.equals("S")) {
                time += 8;
            }
            if (q.equals("T") || q.equals("U") || q.equals("V")) {
                time += 9;
            }
            if (q.equals("W") || q.equals("X") || q.equals("Y") || q.equals("Z")) {
                time += 10;
            }


        }
        System.out.println(time);
    }
}


