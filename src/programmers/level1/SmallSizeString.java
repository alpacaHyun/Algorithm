package programmers.level1;

public class SmallSizeString {

    public int solution(String t, String p) {
        int answer = 0;

        long compare = Long.parseLong(p);
        int stringLength = p.length();

        for (int i = 0; i < t.length() - stringLength + 1; i++) {
            long diff = Long.parseLong(t.substring(i, i + stringLength));
            if (diff <= compare) {
                answer++;
            }
        }

        return answer;
    }
}
