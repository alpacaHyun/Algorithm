package programmers.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*

 */
public class Kakao2019 {

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int solution = solution(board, moves);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            for (int k = 0; k < board.length; k++) {
                int tmp = board[k][moves[i] - 1];
                if (tmp != 0) {
                    if (stack.isEmpty()) {
                        stack.push(tmp);
                        board[k][moves[i] - 1] = 0;
                        break;
                    }
                    if (tmp == stack.peek()) {
                        stack.pop();
                        board[k][moves[i] - 1] = 0;
                        answer += 2;
                        break;
                    }
                    stack.push(tmp);
                    board[k][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

}
