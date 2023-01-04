package doitalgorithm.chapter5;

import java.util.Scanner;

public class Ex5_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수의 최대 공약수");

        System.out.println("정수를 입력하세요");
        int a = sc.nextInt();
        System.out.println("정수를 입력하세요");
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
    }

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

}
