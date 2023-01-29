package programmers.level1;

public class Kakao2021 {

    public static void main(String[] args) {

        solution("z-+.^.");

    }

    public static String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();
        // 2단계
        new_id = new_id.replaceAll("[^a-z-_.0-9]", "");
        // 3단계
        new_id = new_id.replaceAll("[.]{2,}", ".");
        // 4단계
        if (new_id.charAt(0) == '.') {
            new_id = new_id.substring(1, new_id.length());
        }

        if (new_id.length() > 1) {

            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        // 5단계
        if (new_id.equals("")) {
            new_id = "a";
        }

        // 6단계
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
            if (new_id.charAt(14) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        // 7단계
        if (new_id.length() <= 2) {
            while (new_id.length() != 3) {
                new_id += new_id.charAt(new_id.length() -1);
            }
        }


        return new_id;
    }

}
