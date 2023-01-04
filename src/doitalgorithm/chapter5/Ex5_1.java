package doitalgorithm.chapter5;

import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요");

        int x = sc.nextInt();

        System.out.println(factorial(x));
    }

    static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}
