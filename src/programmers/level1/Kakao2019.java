package programmers.level1;

import java.util.Stack;
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

/*
풀이
처음 접근할 땐, 한번 인형을 뽑게 되면 어떻게 뽑은 것을 처리해야 할 지 때문에 고민하면서 시간이 흘렀다.
문제를 조금만 자세히 읽어보면, 이 처리를 배열의 값을 0으로 변경해줒기만 하면 해결된다는 것을 알 수 있었을텐데...

내 로직은 위에서부터 인형을 꺼내면서 배열의 값이 0 이 아닐때 까지 배열을 들어간다.
뽑은 배열의 값을 스택에 있는 값과 비교해서 같으면 push, 다르면 pop 을 해서 문제를 해결해 나갔다.

문제를 풀며 아쉬운 점이, 스택이 비어있을 경우를 추가로 고려해주는 부분 때문에 코드가 길어진 것인데,
더 공부해서 이 부분을 개선할 수 있도록 노력해야겠다.
 */