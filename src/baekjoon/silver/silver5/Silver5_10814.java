package baekjoon.silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Silver5_10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String[][] answerArr = new String[count][2];

        for (int i = 0; i < count; i++) {
            String tmp = br.readLine();
            String[] arr = tmp.split(" ");

            for (int j = 0; j < 2; j++) {
                answerArr[i][j] = arr[j];
            }

        }

        Arrays.sort(answerArr,
                (s1, s2) -> Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]));

        for (String[] strings : answerArr) {
            System.out.println(strings[0] + " " + strings[1]);
        }

//        Arrays.sort(answerArr, new Comparator<String[]>() {
//            // 나이순으로 정렬
//            @Override
//            public int compare(String[] s1, String[] s2) {
//                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
//            }
//
//        });
//        Stream<String[]> sorted = Arrays.stream(answerArr)
//                .sorted(Comparator.comparing(i -> i[0]));

//        sorted.forEach(i -> System.out.println(i[0] + " " + i[1]));



    }

}
