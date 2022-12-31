package programmers.level_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NoSameNumber {

    public static void main(String[] args) {

        int[] arr = {1,1,3,3,0,1,1};

        solution(arr);
    }

    public static int[] solution(int[] arr) {

        Stack stack = new Stack();

        stack.push(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if ((int) stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = (int) stack.pop();
        }

        return answer;
    }

}
