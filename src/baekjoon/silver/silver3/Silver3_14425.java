package baekjoon.silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Silver3_14425 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        int answer = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < first; i++) {
            map.put(br.readLine(), 0);
        }

        for (int i = 0; i < second; i++) {
            if (map.containsKey(br.readLine())) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
