package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze4_10797 {

    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        String[] q = b.split(" ");
        int[] c = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            c[i] = Integer.parseInt(q[i]);
        }
        for (int j = 0; j < c.length; j++){
            if(c[j] == a){
                answer++;
            }
        }

        System.out.println(answer);

    }
}
