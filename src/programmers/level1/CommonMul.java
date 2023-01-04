package programmers.level1;

public class CommonMul {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n, m);

        answer[1] = n * m / answer[0];

        return answer;

    }

    int gcd(int n, int m) { // 최대 공약수
        int r;
        while (m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }

    // 최대공배수 == n * m / 최소공배수
}
