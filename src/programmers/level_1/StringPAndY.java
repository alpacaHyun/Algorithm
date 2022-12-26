package programmers.level_1;

public class StringPAndY {

    public static void main(String[] args) {

        String a = "Aa";

        System.out.println(a.toLowerCase());

    }


    public boolean solution(String s) {

        s = s.toLowerCase();
        int PCount = 0;
        int YCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p'){
                PCount++;
            }
            if(s.charAt(i) == 'y'){
                YCount++;
            }
        }

        if(YCount == PCount) {
            return true;
        }

        return false;
    }

}
