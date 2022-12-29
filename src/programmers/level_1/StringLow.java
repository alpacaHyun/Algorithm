package programmers.level_1;

import java.util.Arrays;
import java.util.Collections;

public class StringLow {

    public String solution(String s) {
        Character[] answer = new Character[s.length()];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            answer[i] = s.charAt(i);
        }

        Arrays.sort(answer, Collections.reverseOrder());

        for (int i = 0; i < answer.length; i++) {
            sb.append(answer[i]);
        }
        return sb.toString();
    }
}
