package baekjoon.silver.silver4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Silver4_1158 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");

        int num = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList();

        for (int i = 1; i <= num; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

//        int count = 0;
//        while (!queue.isEmpty()) {
//            count++;
//            if (count == 3) {
//                sb.append(queue.poll()).append(", ");
//                count = 0;
//                continue;
//            }
//            queue.offer(queue.poll());
//        }
//        sb.delete(sb.length() - 2, sb.length());
//        sb.append(">");

        while (queue.size() != 1) {
            for (int i = 0; i < cut - 1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}
