package programmers.level1;

public class DivideString {

    public static void main(String[] args) {
        String s = "banana";

        solution(s);

    }

    public static int solution(String s) {
        int count = 1;
        int answer = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String tmp = String.valueOf(s.charAt(i));
            String tmp2 = String.valueOf(s.charAt(i + 1));
            if (tmp.equals(tmp2)) {
                count++;
                continue;
            }
            if (!tmp.equals(tmp2)) {
                while (count != 1) {
                    if (tmp.equals(tmp2)) {
                        count++;
                    }
                    if (i > s.length() - 1) {
                        answer++;
                        break;
                    }
                    i++;
                    count--;
                }
                answer++;
                i++;
            }
        }
        return answer;
    }

}
