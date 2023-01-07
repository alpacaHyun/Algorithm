package programmers.level1;

public class MakePrimeNumber {
    public static void main(String[] args) {

        int[] answer = {1, 2, 3, 4};

        System.out.println(solution(answer));
    }

    static int solution(int[] nums) {

        int answer = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int tmp = nums[i] + nums[j] + nums[k];
                    if(checkPrime(tmp) == tmp){
                        answer++;
                    }

                }
            }
        }


        return answer;

    }

    public static int checkPrime(int tmp) {
        for(int i = 2; i < 150; i++) {
            if(tmp % i == 0 && i != 1 && i != tmp){
                return 0;
            }
        }
        return tmp;
    }
}
