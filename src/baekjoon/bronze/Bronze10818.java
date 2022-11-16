package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Bronze10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String[] b = a.split(" ");
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < n; i++){
            answer.add(Integer.parseInt(b[i]));
        }
        Collections.sort(answer);

        System.out.println(answer.get(0) + " " + answer.get(n-1));


    }
}

// 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
// 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
// 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.