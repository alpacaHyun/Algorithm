package programmers.level1;

public class StringToInteger {

    public static void main(String[] args) {
        System.out.println(solution("-1234"));
    }

    public static int solution(String s) {
        StringBuilder sb = new StringBuilder();
        if(s.charAt(0) == '-'){
            for (int i = 1; i < s.length(); i++) {
                sb.append(s.charAt(i));
            }
                String tmp = sb.toString();
                int answer = Integer.parseInt(tmp);
                return answer * -1;
        }
        return Integer.parseInt(s);
    }
}
