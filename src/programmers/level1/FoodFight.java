package programmers.level1;

import java.util.Iterator;
import java.util.Stack;

public class FoodFight {

    public String solution(int[] food) {
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 == 0) {
                continue;
            }
            food[i] -= 1;
        }

        int totalFoodLength = 0;

        for (int i = 1; i < food.length; i++) {
            totalFoodLength += food[i];
        }

        Stack stack = new Stack();

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2 ; j++) {
                stack.push(i);
            }
        }

        stack.push(0);

        for (int i = food.length- 1; i > 0; i--) {
            for (int j = food[i]; j >0 ; j--) {
                stack.push(i);
            }
        }

        Iterator<Integer> iter = stack.iterator();

        while (iter.hasNext()) {
            answer += iter.next();
        }

        return answer;
    }
}
