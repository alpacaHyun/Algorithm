package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 체스판은 8×8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다.
 * 가장 왼쪽 위칸 (0,0)은 하얀색이다.
 * 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 * 8번 for 문
 * i가 0 2 4 6, / 1, 3 5, 7 일 때 하얀판 다르게 구성
 */
public class Bronze2_1100 {
    public static int count;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 8; i++) {
            String input = br.readLine();
            if(i % 2 == 0){
                checkOdd(input);
            }

            if(i % 2 == 1){
                checkEven(input);
            }
        }
        System.out.println(count);

    }

    public static void checkOdd(String input) {
        for (int i = 0; i < 8;) {
            if(input.charAt(i) == 'F'){
                count++;
            }
            i = i +2;
        }
    }

    public static void checkEven(String input) {
        for (int i = 1; i < 8; ) {
            if(input.charAt(i) == 'F'){
                count++;
            }
            i = i + 2;
        }
    }

}
