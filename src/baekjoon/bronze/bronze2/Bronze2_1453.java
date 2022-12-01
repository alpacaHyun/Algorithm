package baekjoon.bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 세준이는 피시방에서 아르바이트를 한다. 세준이의 피시방에는 1번부터 100번까지 컴퓨터가 있다. 들어오는 손님은 모두 자기가 앉고 싶은 자리에만 앉고싶어한다. 따라서 들어오면서 번호를 말한다. 만약에 그 자리에
 * 사람이 없으면 그 손님은 그 자리에 앉아서 컴퓨터를 할 수 있고, 사람이 있다면 거절당한다. 거절당하는 사람의 수를 출력하는 프로그램을 작성하시오. 자리는 맨 처음에 모두 비어있고, 어떤 사람이 자리에 앉으면
 * 자리를 비우는 일은 없다.
 */
public class Bronze2_1453 {

    public static void main(String[] args) throws IOException {

        List<Integer> peopleSeat = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String[] b = a.split(" ");
        for (int i = 0; i < b.length; i++) {
            peopleSeat.add(Integer.parseInt(b[i]));
        }

        for (int i = 0; i < people; i++) {
            if (!answerList.contains(peopleSeat.get(i))) {
                answerList.add(peopleSeat.get(i));
            }
        }

        int answer = people - answerList.size();

        System.out.println(answer);
    }
}
