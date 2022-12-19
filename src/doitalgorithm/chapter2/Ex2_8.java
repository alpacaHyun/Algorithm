package doitalgorithm.chapter2;

import java.util.Scanner;

public class Ex2_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


    }

    static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dChar.charAt(x % r);
            x /= r;
        }while (x != 0);
        return digits;
    }

}
