package programmers.level1;

public class Lotto {

    public static void main(String[] args) {

        int[] a = {0, 0, 0, 0, 0, 0};
        int[] b = {1, 2, 3, 4, 5, 6};

        solution(a, b);

        System.out.println(solution(a, b));
    }


    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int count = 0;
        int zero = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
            }

            for (int j = 0; j < lottos.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
        }


        int max = count + zero;
        if (max >= 6) {
            max = 6;
        }
        int min = count;

        answer[0] = changeRank(max);
        answer[1] = changeRank(min);

        return answer;
    }


    public static int changeRank(int count) {

        if (count == 6) {
            return 1;
        }
        if (count == 5) {
            return 2;
        }
        if (count == 4) {
            return 3;
        }
        if (count == 3) {
            return 4;
        }
        if (count == 2) {
            return 5;
        }
        return 6;


    }
}