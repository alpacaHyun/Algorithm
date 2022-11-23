package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze2_1152 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        String input = br.readLine();
        String[] inputArr = input.split(" ");

        // 문자열 input 받아서 split " " 한 후 빈 문자열은 -1 후 길이와 뺀 만큼 더하기
        for (int i = 0; i < inputArr.length; i++) {
            if(inputArr[i].equals("")){
                count--;
            }
        }
        int answer = inputArr.length + count;
        System.out.println(answer);
    }

}
/**
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까?
 * 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 * 첫 문자열과 끝 문자열은 공백일 수 있다.
 */
