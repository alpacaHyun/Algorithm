package baekjoon.bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze4_3046 {

    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String[] a = n.split(" ");

        int R1 = Integer.parseInt(a[0]);
        int S = Integer.parseInt(a[1]);

        int R2 = (S * 2) - R1;
        System.out.println(R2);

    }
}
