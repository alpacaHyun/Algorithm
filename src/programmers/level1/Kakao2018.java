package programmers.level1;

public class Kakao2018 {

    public static void main(String[] args) {
        System.out.println(solution("1D2S#10S"));
    }

    public static int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        int index = -1;

        String[] dart = dartResult.split("");

        for(int i = 0; i < dart.length; i++) {

            if(dart[i].matches("-?\\d+")){
                index++;
                score[index] = Integer.parseInt(dart[i]);
                if (dart[i + 1].matches("-?\\d+")) {
                    score[index] *=  10;
                    i++;
                }
            }

            if(dart[i].equals("S")){
                score[index] *= 1;
            }
            if(dart[i].equals("D")){
                score[index] *= score[index];
            }
            if(dart[i].equals("T")){
                score[index] *= score[index] * score[index];
            }

            if(dart[i].equals("*") && index != 0) {
                score[index - 1] *= 2;
                score[index] *= 2;
            }
            if(dart[i].equals("*") && index == 0) {
                score[index] *= 2;
            }

            if(dart[i].equals("#")){
                score[index] *= -1;
            }

        }

        for(int i = 0; i < score.length; i++) {
            answer += score[i];
        }
        return answer;
    }
}