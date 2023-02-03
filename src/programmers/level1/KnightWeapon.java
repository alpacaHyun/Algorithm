package programmers.level1;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class KnightWeapon {

    public static void main(String[] args) {
        System.out.println(solution(10, 3, 2));
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int factors = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    factors++;
                } else if (i % j == 0) {
                    factors += 2;
                }
            }

            if (factors > limit) {
                answer += power;
            } else {
                answer += factors;
            }
        }
        return answer;
    }
}
