package baekjoon.silver.silver5;

import java.util.Scanner;

public class Silver5_14916 {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        while (money >= 1) {


            if (money % 5 == 0) {
                count = count + money / 5;
                break;
            }
            if (money < 2) {
                count = -1;
                break;
            }

            money -= 2;
            count++;
        }

        if (count > 0) {
            System.out.println(count);
        }else {
            System.out.println(-1);
        }


    }
}
