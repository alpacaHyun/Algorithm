package programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailRace {

    public static void main(String[] args) {

        String[] par = {"leo", "kiki", "eden"};
        String[] com = {"eden", "kiki"};
        solution(par, com);
    }

    public static String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length - 1; i++) {
            if (!participant[i].equals(completion[i])) {

                return participant[i];
            }
        }

        return participant[participant.length -1];
    }

    public String hashSolution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }

        for (int i = 0; i < participant.length; i++) {
            int tmp = map.get(participant[i]);
            if (tmp != 0) {
                return participant[i];
            }
        }

        return answer;
    }

}
