package baekjoon.silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Silver5_11866 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] tmp = input.split(" ");

        int people = Integer.parseInt(tmp[0]);
        int cycle = Integer.parseInt(tmp[1]);

        Queue queue = new LinkedList();

        for (int i = 1; i <= people; i++) {
            queue.add(i);
        }

        StringBuilder answer = new StringBuilder();
        System.out.print("<");
        while (!queue.isEmpty()) {

            for (int i = 0; i < cycle -1 ; i++) {
                int value = (int) queue.poll();
                queue.offer(value);
            }

            answer.append(queue.poll());
            answer.append(", ");
        }

        answer.delete(answer.length() - 2, answer.length());
        answer.append(">");

        System.out.println(answer);
    }

}
