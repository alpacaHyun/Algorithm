package baekjoon.silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Silver5_1181 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String[] tmp = new String[count];

        for (int i = 0; i < count; i++) {
            tmp[i] = br.readLine();
        }
        Arrays.sort(tmp, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });
        System.out.println(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
            if (!tmp[i - 1].equals(tmp[i])) {
                System.out.println(tmp[i]);
            }
        }

    }
}
