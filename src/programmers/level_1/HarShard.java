package programmers.level_1;

public class HarShard {

    public boolean solution(int x) {
        int numberSum = 0;
        String tmp = String.valueOf(x);
        for (int i = 0; i < tmp.length(); i++) {
            numberSum += Integer.parseInt(String.valueOf(tmp.charAt(i)));
        }

        if(x % numberSum == 0) {
            return true;
        }

        return false;
    }
}
