package doitalgorithm.chapter5;

import java.util.Scanner;

public class Ex5_3 {

    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            n -= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dlqfuq");
        int x = sc.nextInt();

        recur(x);
    }
}
