package baekjoon.bronze.bronze3;

import java.util.Scanner;

/**
 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다. 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 */

public class Bronze3_11721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        for (int i = 0; i < input.length(); ++i) {
            System.out.print(input.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }

}
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        ArrayList<String> answer = new ArrayList<>();
//
//
//        boolean game = true;
//        String N = br.readLine();
//        String[] letter = N.split("");
//        while (game) {
//            for (int i = 0; i < N.length(); i++) {
//                answer.add(letter[i]);
//                if (i == N.length() - 1) {
//                    System.out.println(answer);
//                    game = false;
//                }
//                if (i != 0 && i % 9 == 0) {
//                    System.out.println(answer);
//                    for (int j = 0; j < 10; j++) {
//                        answer.removeAll(answer);
//                    }
//                }
//
//
//            }
//
//        }
//
//    }
