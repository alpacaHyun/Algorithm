package programmers.level_1;

public class Rest1 {

    public int solution(int n) {

        for (int i = 1; i < n; i++) {
            if(n % i == 1) {
                return i;
            }
        }
        return 0;
    }

}
