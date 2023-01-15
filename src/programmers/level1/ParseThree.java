package programmers.level1;

public class ParseThree {

    public int solution(int n) {
        String tmp = "";

        while (n != 0) {
            tmp += n % 3;
            n /= 3;
        }

        return Integer.parseInt(tmp, 3);
    }

}
