package baekjoon.silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_11004 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());

        int[] tmp = new int[count];

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            tmp[i] = Integer.parseInt(st2.nextToken());
        }


        Arrays.sort(tmp);

        System.out.println(tmp[index - 1]);
    }

}
