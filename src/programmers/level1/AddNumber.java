package programmers.level1;

public class AddNumber {

    public int solution(int n) {
        int answer = 0;

        String tmp = String.valueOf(n);

        for (int i = 0; i < tmp.length(); i++) {

            answer += Integer.parseInt(String.valueOf(tmp.charAt(i)));

        }

        return answer;
    }

}
