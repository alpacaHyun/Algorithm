package programmers.level1;

public class Sqrt {

    public long solution(long n) {
        long answer = 0;

        if(Math.sqrt(n) == (int)Math.sqrt(n)) {
            return (long) (Math.sqrt(n) + 1);
        }

        return answer;
    }
}
