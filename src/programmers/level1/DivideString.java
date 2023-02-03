package programmers.level1;

import java.util.stream.Stream;

public class DivideString {

    public static void main(String[] args) {
        String s = "banana";

        int solution = solution(s);

        System.out.println("solution = " + solution);

    }

    public static int solution(String s) {
        int count = 0;
        int diff = 0;
        int answer = 0;
        char first = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {

            if (count == diff) {
                answer++;
                first = s.charAt(i);
            }
            if (first == s.charAt(i)) {
                count++;
            } else {
                diff++;
            }
        }
        return answer;
    }
}
