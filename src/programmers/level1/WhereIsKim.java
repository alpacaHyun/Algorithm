package programmers.level1;

public class WhereIsKim {

    public static void main(String[] args) {
        String[] seoul = {"jane", "Kim"};
        System.out.println(solution(seoul));
    }

    public static String solution(String[] seoul) {

        int kimIndex = 0;

        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                kimIndex = i;
            }
        }

        StringBuilder answer = new StringBuilder();
        answer.append("김서방은 ").append(kimIndex).append("에 있다");
        return answer.toString();
    }
}
