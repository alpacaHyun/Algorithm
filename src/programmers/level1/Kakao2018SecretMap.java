package programmers.level1;

public class Kakao2018SecretMap {

    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};


        System.out.println(solution(n, arr1, arr2));

    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
        String tmp = Integer.toBinaryString(arr1[i]);
            String tmp2 = Integer.toBinaryString(arr2[i]);


                while (tmp.length() != n) {
                    tmp = "0" + tmp;
            }

                while (tmp2.length() != n) {
                    tmp2 = "0" + tmp2;
                }

            String answerStr = "";

            for (int z = n -1 ; z >= 0 ; z--) {

                if (tmp.charAt(z) == '1' || tmp2.charAt(z) == '1') {
                    answerStr = "#" + answerStr;
                    continue;
                }
                answerStr = " " + answerStr;
            }
                answer[i] = answerStr;
        }


        return answer;
    }

}
