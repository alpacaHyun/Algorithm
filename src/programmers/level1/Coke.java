package programmers.level1;

public class Coke {

    public static void main(String[] args) {

        System.out.println(solution(2, 1, 20));

    }

    static int solution(int a, int b, int n) {
        int answer = 0;
        int myCoke = n;
        int count = 0;


        while (true) {
            count = 0;
            if(myCoke < a){
                break;
            }
            while (myCoke >= a) {
                myCoke -= a;
                count += b;
            }
            answer += count;

            myCoke += count;
        }

        return answer;
    }
}
