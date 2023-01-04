package programmers.level1;

public class MakeOne {

    public int solution(int num) {

        int count = 0;

        if(num == 1){
            return 0;
        }

        for (int i = 0; i < 500; i++) {

            if(num == 1) {
                return count;
            }

            if(num % 2 == 0) {
                num /= 2;
                count++;
                continue;
            }

            if(num % 2 == 1) {
                num *= 3;
                num += 1;
                count++;
                continue;
            }

        }

        return -1;
    }

}

