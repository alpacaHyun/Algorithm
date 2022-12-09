package baekjoon.bronze.bronze2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bronze2_2750 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            answerList.add(sc.nextInt());
        }
        Collections.sort(answerList);

        for (int i = 0; i < answerList.size(); i++) {
            System.out.println(answerList.get(i));
        }

    }
}
