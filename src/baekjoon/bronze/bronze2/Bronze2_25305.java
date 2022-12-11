package baekjoon.bronze.bronze2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bronze2_25305 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputA = sc.nextLine();
        String grade = sc.nextLine();

        String[] inputAarr = inputA.split(" ");

        int studentNumber = Integer.parseInt(inputAarr[0]);
        int gradeGetNumber = Integer.parseInt(inputAarr[1]);

        String[] gradeArr = grade.split(" ");
        List<Integer> gradeList = new ArrayList<>();

        for (int i = 0; i < studentNumber; i++) {
            gradeList.add(Integer.parseInt(gradeArr[i]));
        }

        Collections.sort(gradeList);

        System.out.println(gradeList.get(studentNumber - gradeGetNumber));
    }

}
