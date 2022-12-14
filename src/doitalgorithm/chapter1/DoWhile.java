package doitalgorithm.chapter1;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        int n = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n 까지의 합");
        do {
            System.out.println("n 을 입력하세요");
            n = sc.nextInt();
        }while(n <= 0);

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
