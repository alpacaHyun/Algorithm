package programmers.level_1;

import java.util.ArrayList;
import java.util.List;

public class CommonMul {

    public static void main(String[] args) {
        System.out.println(solution(2, 10));
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        if (n < m && m % n == 0) {
            answer[0] = n;
            answer[1] = m;
            return answer;
        }
        if (n > m && n % m == 0) {
            answer[0] = m;
            answer[1] = n;
            return answer;
        }

        answer[0] = findDivide(n, m);
        answer[1] = n * m;

        return answer;
    }

    private static int findDivide(int n, int m) {
        int answer = 0;

        List<Integer> nList = new ArrayList<>();
        List<Integer> mList = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                nList.add(i);
            }
        }

        for (int i = 1; i < m; i++) {
            if (m % i == 0) {
                mList.add(i);
            }
        }
        nList.retainAll(mList);
        return nList.get(nList.size() - 1);
    }

}
