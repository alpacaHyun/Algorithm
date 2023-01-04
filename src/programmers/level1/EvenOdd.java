package programmers.level1;

public class EvenOdd {

    public String solution(int num) {
        String answer = "";

        if(num % 2 == 0) {
            return "Even";
        }

        return "Odd";
    }
}
