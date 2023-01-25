package baekjoon.silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Silver5_2161 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String tmp = br.readLine();
        int number = Integer.parseInt(tmp);

        Queue queue = new LinkedList();

        for (int i = 1; i <= number; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());

            queue.add(queue.peek());
            queue.remove();
        }
    }
}
