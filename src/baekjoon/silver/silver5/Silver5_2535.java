package baekjoon.silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver5_2535 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(arr, (o1, o2) -> {
            return o1[2] - o2[2];
        });


        int t = arr.length - 1;

        int last = t - 2;
        if (arr[t][0] == arr[t-1][0]) {
            for (int i = t-2; i > 0; i--) {
                if (arr[t][0] != arr[i][0]) {
                    last = i;
                    break;
                }
            }
        }
        System.out.println(arr[0][0] + " " + arr[0][1]);
        System.out.println(arr[1][0] + " " + arr[1][1]);
        System.out.println(arr[last][0] + " " + arr[last][1]);
    }
}
