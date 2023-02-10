package programmers.level1;

public class TwoSecret {

    public String solution(String s, String skip, int index) {
        String answer = "";

        char[] chars = s.toCharArray();

        for(int i = 0 ; i < chars.length ; i++){
            for(int j = 0 ; j < index ; j++){
                do{
                    chars[i]++;
                    if(chars[i] > 'z'){ //범위 초과시 a로 돌아옴
                        chars[i] -= 26; // == 'a'와 동일
                    }
                }while(skip.contains(String.valueOf(chars[i])));
            }
        }

        answer = new String(chars);

        return answer;
    }

}
