package programmers.level1;

public class OnlyNumber {

    public static void main(String[] args) {

        System.out.println(solution("a123"));

    }

    public static boolean solution(String s) {

        if (s.length() == 4 || s.length() == 6) {
            try {
                int x = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException numberFormatException) {
                return false;
            }
        }else return false;
    }

}
