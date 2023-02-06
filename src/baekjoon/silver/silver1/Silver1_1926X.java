package baekjoon.silver.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Silver1_1926X {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());

        int[][] tmp = new int[height][width];

        for (int i = 0; i < height; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < width; j++) {
                tmp[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        Graph graph = new Graph(width * height);

        for (int i = 0; i < height - 1; i++) {
            for (int j = 0; j < width - 1; j++) {
                int i1 = tmp[i][j];
                int i2 = tmp[i][j + 1];
                if (i1 == i2 && i1 == 1) {
                    graph.addEdge(i * width + j, i * width + j + 1);
                }
                int i3 = tmp[i + 1][j];
                if (i1 == 1 && i1 == i3) {
                    graph.addEdge(i * width + j ,(i + 1) * width + j);
                }
            }
        }

        for (int i = 0; i < width * height; i++) {
            int a = graph.dfs(i);
            if (a > 0) {
                answer++;
            }
        }
        System.out.println(answer);

    }

    static class Graph {
        class Node {
            int data;
            boolean marked;
            LinkedList<Node> adjacent;

            public Node(int data) {
                this.data = data;
                this.marked = false;
                adjacent = new LinkedList<>();
            }

        }

        Node[] nodes;

        void addEdge(int i1, int i2) {
            Node n1 = nodes[i1];
            Node n2 = nodes[i2];

            if (!n1.adjacent.contains(n2)) {
                n1.adjacent.add(n2);
            }
            if (!n2.adjacent.contains(n1)) {
                n2.adjacent.add(n2);
            }
        }

        public Graph(int size) {
            nodes = new Node[size];

            for (int i = 1; i <= size; i++) {
                nodes[i - 1] = new Node(i);
            }
        }

        int dfs(int index) {
            int count = 0;
            Node root = nodes[index];
            root.marked = false;
            Stack<Node> stack = new Stack<>();

            for (Node n : root.adjacent) {
                if (n.marked == false) {
                    n.marked = true;
                    stack.push(n);
                    count++;
                }
            }

            return count;
        }
    }
}
