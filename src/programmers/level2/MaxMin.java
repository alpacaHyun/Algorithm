package programmers.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MaxMin {
    public static void main(String[] args) {
        solution("1 2 3 4");
    }
    public static String solution(String s) {
        String answer = "";

        StringTokenizer st = new StringTokenizer(s, " ");

        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        int max = list.get(0);
        int min = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            int compare = list.get(i);

            if (max < compare) {
                max = compare;
            }
            if (min > compare) {
                min = compare;
            }
        }
        answer += min + " " + max;
        return answer;
    }
}
