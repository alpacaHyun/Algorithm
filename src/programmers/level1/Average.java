package programmers.level1;

public class Average {

    public static void main(String[] args) {

    }

    private static double Solution(int[] arr) {
        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        answer /= arr.length;
        return answer;
    }

}
