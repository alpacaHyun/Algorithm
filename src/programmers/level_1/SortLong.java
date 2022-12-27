package programmers.level_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortLong {
    public static void main(String[] args) {
        System.out.println(solution(8766321));
    }
    public static long solution(long n) {
        List<String> tmp = new ArrayList<>();
        String str = String.valueOf(n);

        for (int i = 0; i < str.length(); i++) {
            tmp.add(String.valueOf(str.charAt(i)));
        }

        tmp.sort(Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tmp.size(); i++) {
            sb.append(tmp.get(i));
        }

        return Long.parseLong(sb.toString());
    }
}
