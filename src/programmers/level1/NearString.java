package programmers.level1;

public class NearString {

    public static void main(String[] args) {

        solution("banana");
    }


    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {

            int tmp = -1;

            int count = 0;
            for (int j = i; j >= 0; j--) {

                if (s.charAt(i) == s.charAt(j) && i != j) {

                    tmp = count;
                    break;
                }
                    count++;

            }

            answer[i] = tmp;
        }

        return answer;
    }

}
