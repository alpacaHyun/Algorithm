package programmers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraySum {

    public static void main(String[] args) {
        int[] first = {2, 1, 1};

        System.out.println(solution(first));


    }

    public static  int[] solution(int[] numbers) {
//        Set<Integer> answerList = new HashSet<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int number = numbers[i] + numbers[j];
                if(i != j && !answerList.contains(number)){
                    answerList.add(number);
                }
            }
        }

        Collections.sort(answerList);

        Integer[] answer = answerList.stream().toArray(Integer[]::new);

        int[] result = Arrays.stream(answer).mapToInt(i->i).toArray();


        return result;
    }

}
