package programmers.level1;

public class MiddleString {

    public String solution(String s) {

        StringBuilder answer = new StringBuilder();

        int middle = s.length() / 2;

        if (s.length() % 2 == 0) {
            answer.append(s.charAt(middle - 1));
            answer.append(s.charAt(middle));

            return answer.toString();
        }

        answer.append(s.charAt(middle));

        return answer.toString();
    }

}
