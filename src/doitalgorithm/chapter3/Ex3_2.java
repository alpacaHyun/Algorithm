package doitalgorithm.chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] x = {
                "abstract", "assert", "boolean", "break"
        };

        System.out.println("원하는 키워드를 입력하세요");
        String input = sc.nextLine();

        int index = Arrays.binarySearch(x, input);

        if (index < 0) {
            System.out.println("해당 키워드가 없습니다");
        } else {
            System.out.println("해당 키워드는 x[" + index + "] " + "에 있습니다.");
        }
    }

}
