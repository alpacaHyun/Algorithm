package programmers.level_1;

public class NextString {

    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                answer += ' ';
                continue;
            }

            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if (s.charAt(i) + n <= 'z') {
                    answer += (char) (s.charAt(i) + n);
                    continue;
                }

                if (s.charAt(i) + n > 'z') {
                    answer += (char) (s.charAt(i) + n - 26);
                }
            }

            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                if (s.charAt(i) + n <= 'Z') {
                    answer += (char) (s.charAt(i) + n);
                    continue;
                }

                if (s.charAt(i) + n > 'Z') {
                    answer += (char) (s.charAt(i) + n - 26);
                }
            }

        }

        return answer;
    }

}

/**
 * 아스키코드 65 == A 90 == Z
 * <p>
 * 97 == a 122 = z
 */

