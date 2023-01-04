package baekjoon.bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bronze2_1076 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);

        String firstValue = br.readLine();
        String secondValue = br.readLine();
        String multiple = br.readLine();

        long value = Long.valueOf((map.get(firstValue) * 10) + map.get(secondValue));
        long answer = (long) (value * Math.pow(10, map.get(multiple)));

        System.out.println(answer);
    }

}
