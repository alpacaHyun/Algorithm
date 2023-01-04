package programmers.level1;

public class ReverseArr {

    public int[] solution(long n) {

        String tmp = String.valueOf(n);
        int[] answer = new int[tmp.length()];
        for (int i = 0; i < tmp.length(); i++) {
            answer[i] = Integer.parseInt(String.valueOf(tmp.charAt(i)));
        }

        for (int i = 0; i < answer.length / 2; i++) {
            swap(answer, i, answer.length - i - 1);
        }

        return answer;
    }

    public void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
}
