package baekjoon.bronze.bronze2;

import java.util.Scanner;

/**
 * 소문자, 대문자, 숫자, 공백 순서로 출력
 */

public class Bronze2_10820 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputArr = input.split("");

        int upperCase = 0;
        int lowerCase = 0;
        int number = 0;
        int blank = 0;

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].matches("-?\\d+")) {
                number++;
            }
            if (inputArr[i].equals(" ")) {
                blank++;
            }
            if (Character.isUpperCase(input.charAt(i))) {
                upperCase++;
            }
            if (Character.isLowerCase(input.charAt(i))) {
                lowerCase++;
            }
        }

        System.out.println(lowerCase + " " + upperCase + " " + number + " " + blank);

    }
}
