package programmers.level0;

public class Chicken {

    public int solution(int chicken) {

        int bonus = 0;
        int count = 0;
        for (int i = 0; i < chicken; i++) {
            count++;
            if (count == 10) {
                chicken++;
                count -= 10;
                bonus++;
            }
        }
        return bonus;
    }

}
