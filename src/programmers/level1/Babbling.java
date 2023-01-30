package programmers.level1;

// "aya", "ye", "woo", "ma"
public class Babbling {

    public static void main(String[] args) {
        String[] a = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        solution(a);
    }

    public static int solution(String[] babbling) {
        int answer= 0;

        for (int i = 0; i < babbling.length; i++) {
            String tmp = babbling[i];

            tmp = tmp.replace("aya", "0");
            tmp = tmp.replace("ye", "1");
            tmp = tmp.replace("woo", "2");
            tmp = tmp.replace("ma", "3");

            tmp = tmp.replaceAll("[^0-9]", "++");

            if (!tmp.contains("++")) { // 숫자만 포함할 경우

                for (int j = 0; j < tmp.length() - 1; j++) {
                    if (tmp.charAt(j) == tmp.charAt(j + 1)) {
                        answer--;
                        break;
                    }
                }
                answer++;

            }
        }


        return answer;
    }


}
