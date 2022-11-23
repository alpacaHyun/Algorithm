package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bronze3_10817 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] inputNum = input.split(" ");
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            nums.add(Integer.parseInt(inputNum[i]));
        }
        Collections.sort(nums);

        System.out.println(nums.get(1));
    }
}
