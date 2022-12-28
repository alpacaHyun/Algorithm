package programmers.level_1;

public class RepeatString {

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                sb.append("박");
            }
            if (i % 2 == 1) {
                sb.append("수");
            }
        }

        return sb.toString();
    }

}
