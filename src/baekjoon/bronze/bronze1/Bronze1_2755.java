package baekjoon.bronze.bronze1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 최백준이 이번 학기에 들은 과목과 학점 그리고 성적이 주어졌을 때, 평균 평점을 계산하는 프로그램을 작성하시오.
 * 성적은 A+~F까지 총 13개가 있다.
 * A+: 4.3, A0: 4.0, A-: 3.7
 * B+: 3.3, B0: 3.0, B-: 2.7
 * C+: 2.3, C0: 2.0, C-: 1.7
 * D+: 1.3, D0: 1.0, D-: 0.7
 * F: 0.0
 * 평균 평점은 각 과목의 학점*성적을 모두 더한 뒤에, 총 학점으로 나누면 된다.
 */

public class Bronze1_2755 {

    public static void main(String[] args) throws IOException {

        List<List> totalSubject = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int subjectCount = Integer.parseInt(br.readLine());


        for (int i = 0; i < subjectCount; i++) {
            List<String> oneSubject = new ArrayList<>();
            String input = br.readLine();
            String[] list = input.split(" ");
            for (int j = 0; j < list.length; j++) {
            oneSubject.add(list[j]);
            }
            totalSubject.add(oneSubject);
        }

        // 학점 총 합친 값 -> 이수한 학점으로 나눠주어야 함
        double answer = 0;
        for (int i = 0; i < subjectCount; i++) {
            double oneGrade = 0;
            double grades = Double.parseDouble((String) totalSubject.get(i).get(1));
            String stringGrade = (String) totalSubject.get(i).get(2);

            answer += grades * getGrade(stringGrade);
        }

        // 이수한 학점 구하기
        double howManyGradeAnswer = 0;
        for (int i = 0; i < subjectCount; i++) {
            double howManyGrade = Double.parseDouble((String) totalSubject.get(i).get(1));
            howManyGradeAnswer += howManyGrade;
        }

        double beforeAnswer = answer / howManyGradeAnswer;
        double realAnswer = (Math.round(beforeAnswer * 100)) / 100.0;

        System.out.println(realAnswer);
    }

    private static double getGrade(String grade) {
        if(grade.equals("A+")){
            return 4.3;
        }
        if(grade.equals("A0")){
            return 4.0;
        }
        if(grade.equals("A-")){
            return 3.7;
        }
        if(grade.equals("B+")){
            return 3.3;
        }
        if(grade.equals("B0")){
            return 3.0;
        }
        if(grade.equals("B-")){
            return 2.7;
        }
        if(grade.equals("C+")){
            return 2.3;
        }
        if(grade.equals("C0")){
            return 2.0;
        }
        if(grade.equals("C-")){
            return 1.7;
        }
        if(grade.equals("D+")){
            return 1.3;
        }
        if(grade.equals("D0")){
            return 1.0;
        }
        if(grade.equals("D-")){
            return 0.7;
        }
        if(grade.equals("F")){
            return 0.0;
        }
        return 0;
    }


}
