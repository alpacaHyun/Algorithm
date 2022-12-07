package baekjoon.bronze.bronze2;
/**
 * 5 개의 자연수가 주어지고  (10의 배수로) 첫 줄에 평균 둘째 줄에
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bronze2_2587 {

    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a,b,c,d,e;
        int aa, bb, cc ,dd ,ee;
        a = br.readLine();
        b = br.readLine();
        c = br.readLine();
        d = br.readLine();
        e = br.readLine();

        aa = Integer.parseInt(a);
        bb = Integer.parseInt(b);
        cc = Integer.parseInt(c);
        dd = Integer.parseInt(d);
        ee = Integer.parseInt(e);

        list.add(aa);
        list.add(bb);
        list.add(cc);
        list.add(dd);
        list.add(ee);

        Collections.sort(list);
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            temp += list.get(i);
        }

        int answer = temp / 5;

        System.out.println(answer);
        System.out.println(list.get(2));
    }

}
